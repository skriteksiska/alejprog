public class Kruh extends Tvar {
	protected int polomer;
	public Kruh (int x, int y, int polomer) {
		super(x,y);
		this.polomer = polomer;	
	}
	public void kresli() {
		System.out.printf("Kruh se souradnicemi [%d, %d] a prumerem %d\n", this.x, this.y, this.polomer);
	}
}