package cz.alisma.alej.prog.polynomial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolynomialExample {
	public static void main(String[] args) {
		Polynomial left = null;
		Polynomial right = null;
		String op = null;
		
		List<Double> coeffs = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			boolean store = false;
			try {
				double value = Double.parseDouble(args[i]);
				coeffs.add(value);
			} catch (NumberFormatException e) {
				op = args[i];
				store = true;
			}
			if (i + 1 == args.length) {
				store = true;
			}
			if (store) {
				Collections.reverse(coeffs);
				if (left == null) {
					left = new Polynomial(coeffs.toArray(new Double[0]));
				} else if (right == null) {
					right = new Polynomial(coeffs.toArray(new Double[0]));
				} else {
					System.out.printf("Too many operators.\n");
					return;
				}
				coeffs.clear();
			}
		}
		
		if ((left == null) || (right == null) || (op == null)) {
			System.out.printf("Not enough parameters.\n");
			return;
		}
		
		Polynomial result = new Polynomial(left.getCoefficients());
		
		if (op.equals("+")) {
			result.add(right);
			System.out.printf("(%s) + (%s) = %s\n", left, right, result);
		} else if (op.equals("-")) {
			result.subtract(right);
			System.out.printf("(%s) - (%s) = %s\n", left, right, result);
		} else if (op.equals("*") || op.equals("x")) {
			result.multiplyBy(right);
			System.out.printf("(%s) * (%s) = %s\n", left, right, result);
		} else if (op.equals("/")) {
			Polynomial rem = result.divideBy(right);
			System.out.printf("(%s) / (%s) = %s (rem. %s)\n", left, right, result, rem);
		} else {
			System.out.printf("Uknown operator %s\n", op);
		}
	}
}
