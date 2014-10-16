public class Odmocnina {
	public static void main(String[] args) {
		Double vstupniCislo, presnost = 0.01, odhad, predchoziOdhad;
		
		vstupniCislo = Double.parseDouble(args[0]);
		if (args.length >= 2) {
			presnost = Double.parseDouble(args[1]);
		}
		
		odhad = vstupniCislo;
		predchoziOdhad = Double.MAX_VALUE;
		
		while (Math.abs(odhad-predchoziOdhad) > presnost) {
			predchoziOdhad = odhad;
			odhad = odhad + (vstupniCislo/odhad);
			odhad /= 2;
		}
		
		System.out.printf("Odhad odmocniny z %.2f je %.2f.", vstupniCislo, odhad);
	}
}