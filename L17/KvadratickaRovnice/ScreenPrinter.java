import cz.alisma.alej.prog.pg17.QuadraticEquationPrinter;

public class ScreenPrinter implements QuadraticEquationPrinter {
	public void printEquation(int a, int b, int c, int x1, int x2) {
		if (a == 1) {
			System.out.printf("x^2");
		}
		else {
			System.out.printf("%d * x^2", a);
		}
		
		if (b > 0) {
			System.out.printf(" + %dx", b);
		}
		else if (b < 0) {
			System.out.printf(" - %dx", -b);
		}
		
		if (c > 0) {
			System.out.printf(" + %d", c);
		}
		else if (c < 0) {
			System.out.printf(" - %d", -c);
		}
		
		System.out.println(" = 0");
	}
}