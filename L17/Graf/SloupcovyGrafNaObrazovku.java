public class SloupcovyGrafNaObrazovku implements KreslicGrafu {
	private static final int maxVyska = 60;
	private int[] hodnoty;
	
	private static void opakujZnak(char znak, int kolikrat) {
        while (kolikrat > 0) {
            System.out.printf("%c", znak);
            kolikrat--;
        }
    }
	
	public void vykresli(int pocetHodnot, int max) {
		double prepocet = (double) maxVyska / max;
 
        for (int i = 0; i < pocetHodnot; i++) {
            opakujZnak('#', (int) (hodnoty[i] * prepocet));
            System.out.println();
        }
	}
	
	public SloupcovyGrafNaObrazovku(int[] hodnoty) {
		this.hodnoty = hodnoty;
	}
}