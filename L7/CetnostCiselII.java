public class CetnostCiselII {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Cetnosti cetnosti = new Cetnosti();

		while (sc.hasNextInt()) {
			cetnosti.zapocitej(sc.nextInt());
		}
		
		int[] pom = cetnosti.seznamCisel();
		for (int i=0; i < pom.length; i++) {
			System.out.printf("Cislo %d se vyskytovalo %dx\n", pom[i], cetnosti.cetnost(i));
		}
	}
}