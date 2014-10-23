public class Bod extends Tvar {
	public Bod (int x, int y) {
		super(x,y);	
	}
	public void kresli() {
		System.out.printf("Bod se souradnicemi [%d, %d]\n", this.x, this.y);
	}
}