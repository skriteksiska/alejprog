package cz.alisma.alej.prog.polynomial;

public class Polynomial {
	private static final double EPSILON = 0.00001;
	
	private IntToDoubleMapWithAdding coefficients;
	
	public Polynomial(Double... coef) {
		coefficients = new IntToDoubleMapWithAdding();
		for (int i = 0; i < coef.length; i++) {
			coefficients.set(i, coef[i]);
		}
	}
	
	public Polynomial(double... coef) {
		coefficients = new IntToDoubleMapWithAdding();
		for (int i = 0; i < coef.length; i++) {
			coefficients.set(i, coef[i]);
		}
	}

	private Polynomial(IntToDoubleMapWithAdding coeffs) {
		coefficients = coeffs;
	}

	protected void addMultiplication(double coef, Polynomial other) {
		for (int idx : other.coefficients.getNonZeroIndexesUnsorted()) {
			coefficients.add(idx, coef * other.coefficients.get(idx));
		}
	}
	
	public void add(Polynomial other) {
		addMultiplication(1, other);
	}

	public void subtract(Polynomial other) {
		addMultiplication(-1, other);
	}

	public void multiplyBy(Polynomial other) {
		IntToDoubleMapWithAdding result = new IntToDoubleMapWithAdding();
		for (int myIdx : coefficients.getNonZeroIndexesUnsorted()) {
			for (int otherIdx : other.coefficients.getNonZeroIndexesUnsorted()) {
				int idx = myIdx + otherIdx;
				double value = coefficients.get(myIdx) * other.coefficients.get(otherIdx);
				result.add(idx, value);
			}
		}
		coefficients = result;
	}

	public Polynomial divideBy(Polynomial other) {
		IntToDoubleMapWithAdding result = new IntToDoubleMapWithAdding();
		
		if (other.coefficients.isEmpty()) {
			throw new ArithmeticException(String.format(
					"Cannot divide by zero in %s / %s",
					this.toString(), other.toString()));
		}
		
		int otherDegree = other.coefficients.getHighestIndex();
		while (true) {
			int remainderDegree = coefficients.getHighestIndex();
		
			double divisionResult = coefficients.get(remainderDegree) / other.coefficients.get(otherDegree);
			
			result.set(remainderDegree - otherDegree, divisionResult);
					
			IntToDoubleMapWithAdding partialResult = new IntToDoubleMapWithAdding();
			partialResult.set(remainderDegree - otherDegree, divisionResult);
			
			Polynomial resultPoly = new Polynomial(partialResult);
			resultPoly.multiplyBy(other);
			subtract(resultPoly);
			
			if (!isZero(coefficients.get(remainderDegree))) {
				System.out.printf("Houston, we have a problem.\n");
				break;
			}
			
			if (remainderDegree <= otherDegree) {
				break;
			}
		}
		
		Polynomial remainder = new Polynomial(coefficients);
		this.coefficients = result;
			
		return remainder;
	}

	public double[] getCoefficients() {
		double[] result = new double[coefficients.getHighestIndex() + 1];
		for (int i = 0; i < result.length; i++) {
			result[i] = coefficients.get(i);
		}
		return result;
	}

	public int getDegree() {
		return  coefficients.getHighestIndex();
	}

	@Override
	public String toString() {
		String result = "";
		boolean signNeeded = false;
		double[] coeffs = getCoefficients();
		for (int degree = coeffs.length - 1; degree >= 0; degree--) {
			double d = coeffs[degree];
			if (isZero(d)) {
				continue;
			}
			if (d < 0.) {
				result += " - ";
				d = -d;
			} else if (signNeeded) {
				result += " + ";
			}
			if (!isZero(d - 1) || (degree == 0)) {
				result += String.format("%.2f", d);
			}
			if (degree > 0) {
				if (degree > 1) {
					result += String.format("x^%d", degree);
				} else {
					result += "x";
				}
			}
			signNeeded = true;
		}
		if (result.isEmpty()) {
			result = "0";
		}
		return result;
	}
	
	private static boolean isZero(double value) {
		return (value > -EPSILON) && (value < EPSILON);
	}
}
