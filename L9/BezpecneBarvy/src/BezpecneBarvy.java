
public class BezpecneBarvy {

	public static void main(String[] args) {
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html>\n<head>\n  <title>Safe web colors</title>\n  <style>table {color: white;}</style>\n</head>\n<body>\n\n<table style=\"width: 100%\">");
		
		int r=-3, g=0, b=0;
		
		for (int y=0; y < 36; y++) {
			System.out.println("  <tr>");
			
			if (y%6 == 0) {
				g = 0;
				r += 3;
			}
			
			// vypis radku
			b = 0;
			for (int x=0; x<6; x++) {
				
				System.out.printf("    <td style=\"background-color: #%x%x%x;color:#%x%x%x;\">#%x%x%x</td>\n",
							      r, g, b, 15-r,15-g,15-b, r, g, b);
				b += 3;
			}
			
			g += 3;
			
			System.out.println("  </tr>");
		}
		
		
		System.out.println("</table>\n\n</body>\n</html>");
			
	}

}
