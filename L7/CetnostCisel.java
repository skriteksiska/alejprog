public class CetnostCisel {
	public static void main(String[] args) {
		Cislo cisla[] = new Cislo[500];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int vstup;
		int pocet = 0;
		
		while (sc.hasNextInt()) {
			vstup = sc.nextInt();
			for (int i=0; i < pocet; i++) {
				if (vstup == cisla[i].getVelikost()) {
					cisla[i].zvysCetnost();
					continue;
				}
			}
			if (vstup != cisla[pocet].getVelikost()) {
				cisla[pocet] = new Cislo(vstup);
				pocet++;
			}
		}
		
		for (int i=0; i < pocet; i++) {
			System.out.printf("Cislo %d se vyskytovalo %dx\n", cisla[i].getVelikost(), cisla[i].getCetnost());
		}
	}
}