public class Cislo {
	private int velikost;
	private int cetnost;
	public Cislo(int velikost) {
		this.velikost = velikost;
		cetnost = 1;
	}
	public int getCetnost() {
		return this.cetnost;
	}
	public int getVelikost() {
		return this.velikost;
	}
	public void zvysCetnost() {
		this.cetnost++;
	}
}