public class Kresleni {
	public static void main(String[] args) {
		Tvar tvary[] = new Tvar[50];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int pocet = 0;
		
		while ((sc.hasNextInt()) && (pocet < 50)) {
			switch (sc.nextInt()) {
			case 0:		// bod
				tvary[pocet] = new Bod(sc.nextInt(), sc.nextInt());
				break;
			case 1:		// kruh
				tvary[pocet] = new Kruh(sc.nextInt(), sc.nextInt(), sc.nextInt());
				break;
			case 2:		// obdelnik
				tvary[pocet] = new Obdelnik(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				break;
			}
			
			pocet++;
		}
		
		for (int i=0; i < pocet; i++) {
			tvary[i].kresli();
		}
	}
}