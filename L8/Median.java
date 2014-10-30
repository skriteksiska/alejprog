public class Median {
	public static void main(String[] args) {
		int[] pole = Median.nactiCisla();
		int delka = pole.length - 1;
		
		Setrid.setridCisla(pole, delka);
		
		if ((delka % 2) == 1) {
			System.out.printf("Median techto cisel je %d.\n", pole[(delka/2)]);
		}
		else {
			System.out.printf("Median techto cisel je %.3f.\n", (pole[delka/2]+pole[(delka/2)-1]) / 2.0);
		}
	}
	public static int[] nactiCisla() {
		int[] pole = new int[1];
		int pocet = 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while (scanner.hasNextInt()) {
			if (pocet < pole.length) {
				pole = Median.zvetsiPole(pole);
			}
			
			pole[pocet] = scanner.nextInt();
			pocet++;
		}

		return pole;
	}
	public static int[] zvetsiPole(int[] pole) {
		int[] pom = new int[pole.length + 1];
		for (int i=0; i < pole.length; i++) {
			pom[i] = pole[i];
		}
		return pom;
	}
}