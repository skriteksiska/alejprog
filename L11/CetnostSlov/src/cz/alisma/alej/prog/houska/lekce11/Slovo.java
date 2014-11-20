package cz.alisma.alej.prog.houska.lekce11;

public class Slovo {
	private String hodnota;
	private int cetnost;
	public Slovo(String hodnota) {
		this.hodnota = hodnota;
		cetnost = 1;
	}
	public int getCetnost() {
		return this.cetnost;
	}
	public String getVelikost() {
		return this.hodnota;
	}
	public void zvysCetnost() {
		this.cetnost++;
	}
	public void setCetnost(int a) {
		this.cetnost = a;
	}
}