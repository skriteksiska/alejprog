
public class BezpecneBarvy {

	public static void main(String[] args) {
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html>\n<head>\n<title>Safe web colors</title>\n</head>\n<body>\n\n<table style=\"width: 100%\">");
		
		int r=0, g=0, b=0;
		
		// <td style="background-color: #C09;">#CC0099</td>
		for (int y=0; y < 36; y++) {
			System.out.println("  <tr>");
			
			g++;
			if (y%6 == 0) {
				g = 0;
				r++;
			}
			
			b = 0;
			for (int x=0; x<6; x++) {
				b++;
				System.out.printf("    <td style=\"background-color: #%x%x%x;color: white;\">	%x%x%x	</td>\n",
							      r, g, b, r, g, b);
			}
			
			System.out.println("  </tr>");
		}
		
		
		System.out.println("</table>\n\n</body></html>");
			
	}

}
