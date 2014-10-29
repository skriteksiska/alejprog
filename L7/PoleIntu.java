public class PoleIntu {
	private int[] pole;
	private int delka;

	public PoleIntu() {
		delka = 0;
	}
	
	// Pøidá èíslo na konec "pole"
	public void pridej(int a) {
		delka++;
		int[] pom = new int[delka];
		for (int i=0; i < delka-1; i++) {
			pom[i] = this.pole[i];
		}
		pom[delka-1] = a;
		this.pole = pom;
	}
	
	// Vrátí poèet prvkù v poli
	public int delka() {
		return this.delka;
	}
	
	// Øekne prvek na i-tém místì v poli
	public int prvek(int i) {
		return this.pole[i];
	}
}