import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SloupcovyGraf {
	public static void main(String[] args) {
		
		/*
		<svg xmlns="http://www.w3.org/2000/svg"
	    width="140" height="120"
	    viewBox="0 0 140 120">
	    <rect x="10" y="10" width="20" height="100"
	        fill="blue" stroke="black" stroke-width="2"/>
	    <rect x="35" y="50" width="20" height="60"
	        fill="blue" stroke="black" stroke-width="2"/>
	    <rect x="60" y="30" width="20" height="80"
	        fill="blue" stroke="black" stroke-width="2"/>
	    <rect x="85" y="90" width="20" height="20"
	        fill="blue" stroke="black" stroke-width="2"/>
	    <rect x="110" y="70" width="20" height="40"
	        fill="blue" stroke="black" stroke-width="2"/>
		</svg>
		 */
		
		/*
		public class Graf {
		
		   public static void vykresli(Double velikost) {
		      for (int i=0; i < velikost; i++) {
						System.out.printf("#");
					}
		   }
		
			public static void main(String[] args) {
				int pole[] = new int[100];
				int i = 0, max = 0;
				java.util.Scanner sc = new java.util.Scanner(System.in);
				
				while (sc.hasNextInt()) {
					pole[i] = sc.nextInt();
					if (pole[i] > max) {
						max = pole[i];
					}
					i++;
				}
				
				Double meritko = max / 60.0;
				if (max < 60) {
		         meritko = 1.0;
		      }
		      
				for (int j=0; j < i; j++) {
					vykresli(pole[j] / meritko);
					System.out.println();
				}
			}
		}
		*/
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		ArrayList<Integer> pole = new ArrayList<Integer>();
		int max = 0, i = 0;
		
		while (sc.hasNextInt()) {
			pole.add(sc.nextInt());
			if (pole.get(i) > max) {
				max = pole.get(i);
			}
			i++;
		}

		float meritko = (float) (100.0 / max);
		
		System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"140\""
						 + "\n    height=\"120\"    viewBox=\"0 0 140 120\">");
		for (int j=0; j<i; j++) {
			System.out.printf("<rect x=\"%d\" y=\"%d\" width=\"20\" height=\"%d\" fill=\"blue\" stroke=\"black\" stroke-width=\"2\"/>",
							   10+j*30, 120-Math.round(meritko*pole.get(j)), Math.round(meritko*pole.get(j)));
		}
		
		System.out.println("</svg>");
		
	}
}
