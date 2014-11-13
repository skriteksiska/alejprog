import java.util.ArrayList;

public class SloupcovyGraf {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		ArrayList<Integer> pole = new ArrayList<Integer>();
		int max = 0, n = 0;
		
		while (sc.hasNextInt()) {
			pole.add(sc.nextInt());
			if (pole.get(n) > max) {
				max = pole.get(n);
			}
			n++;
		}
		sc.close();

		float meritko = (float) (300.0 / max);
		
		System.out.printf("<?xml version=\"1.0\"?>\n<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" "
						 + "\"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"
						 + "<svg xmlns=\"http://www.w3.org/2000/svg\"\n     width=\"%d\" height=\"400\">\n\n", 100+n*50);
		for (int i=0; i<n; i++) {
			System.out.printf("  <rect x=\"%d\" y=\"%d\" width=\"30\" height=\"%d\" fill=\"blue\" stroke=\"black\" stroke-width=\"2\"/>\n",
							   50+i*50, 350-Math.round(meritko*pole.get(i)), Math.round(meritko*pole.get(i)));
		}
		
		System.out.println("\n</svg>");
	}
}
