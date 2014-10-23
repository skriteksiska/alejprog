public class Obdelnik extends Tvar {
	protected int sirka;
	protected int vyska;
	public Obdelnik (int x, int y, int sirka, int vyska) {
		super(x,y);
		this.sirka = sirka;
		this.vyska = vyska;	
	}
	public void kresli() {
		System.out.printf("Obdelnik se souradnicemi [%d, %d], sirkou %d a vyskou %d\n", this.x, this.y, this.sirka, this.vyska);
	}
}