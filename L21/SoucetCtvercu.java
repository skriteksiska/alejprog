public class SoucetCtvercu {
	public static int sumSquares(int... cisla) {
		int soucet = 0;
		for (int i=0; i < cisla.length; i++) {
			soucet += cisla[i] * cisla[i];
		}
		return soucet;
	}

	public static void main(String[] args) {
	    int x = sumSquares(1, 2, 3);
		int y = sumSquares(4, 2, 7, 10);
		
		System.out.printf("x = %d\ny = %d", x, y);
	}
}