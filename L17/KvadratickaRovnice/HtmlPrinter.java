import cz.alisma.alej.prog.pg17.QuadraticEquationPrinter;

public class HtmlPrinter implements QuadraticEquationPrinter {
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
		
		System.out.println(" = 0 <br />");
	}
	/*public void end() {
	    System.out.printf("\n</body>\n</html>");
	}*/
	public HtmlPrinter() {
		System.out.printf("<!DOCTYPE html>\n<html>\n<head>\n  <title>");
		System.out.printf("Quadratic Equations</title>\n</head>\n<body>\n\n");
	}
}