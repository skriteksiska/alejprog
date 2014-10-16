public class Kvadraticka_rovnice {
	public static void main (String[] args) {
		
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double c = Double.parseDouble(args[2]);
		
		double D = b*b - 4*a*c;
		if (D < 0) {
			System.out.println("Rovnice nema zadne reseni v R.");
		} else if (D == 0) {
			System.out.printf("K = {%.2f}\n", -b/2/a);
		} else {
			System.out.printf("K = {%.2f; %.2f}\n",
				          (-b-Math.sqrt(D))/2/a, (-b+Math.sqrt(D))/2/a);
		}		

	}
}