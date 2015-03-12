package cz.alisma.alej.prog.houska.lekce12;

public class SoustavaRovnic {
	
	// pro ladeni
	private static void vypis(int[][] matice) {
		System.out.println();
		for (int i=0; i < matice.length; i++) {
			for (int j=0; j < matice[i].length; j++) {
				if (j-1 == matice[i].length) {
					System.out.printf("| ");
				}
				System.out.printf("%d ", matice[i][j]);				
			}
			System.out.println();
		}
	}
	
	public static void odecti(int[][] matice, int a, int b) {
		int koefB = matice[a][a];
		int koefA = matice[b][a];
		
		if (koefA*koefB > 0) {
			koefB = -koefB;
		}
		
		for (int i=0; i < matice[b].length; i++) {
			matice[b][i] = koefB * matice[b][i] + koefA * matice[a][i];
		}
	}
	
	public static void main(String[] args) {
		int promennych = Integer.parseInt(args[0]);
		int[][] matice = new int[promennych][promennych+1];
		
		java.util.Scanner vstup = new java.util.Scanner(System.in);
		
		// nacteni matice
		for (int i=0; i < promennych; i++) {
			for (int j=0; j < promennych+1; j++) {
				if (vstup.hasNextInt()) {
					matice[i][j] = vstup.nextInt();
				}
				else {
					System.out.println("Nezadali jste dost informaci.");
					return;
				}
			}
		}
		
		//vypis(matice);
		
		// uprava matice
		for (int prvniradek=0; prvniradek < promennych-1; prvniradek++) {
			for (int druhyradek=prvniradek+1; druhyradek < promennych; druhyradek++) {
				odecti(matice, prvniradek, druhyradek);
			}
			//vypis(matice);
		}
		
		double[] vysledky = new double[promennych];
		double soucet;
		
		for (int i=promennych-1; i >= 0; i--) {
			soucet = 0;
			for (int j=i+1; j < promennych; j++) {
				soucet -= matice[i][j] * vysledky[j];
			}
			soucet += matice[i][promennych];
			vysledky[i] = soucet / matice[i][i];
		}
		
		for (int i=0; i < promennych; i++) {
			System.out.printf("x_%d = %f\n", i+1, vysledky[i]);
		}
	}
}
