package cz.alisma.alej.prog.polynomial;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Ignore;

@Ignore
public class PolynomialBaseTest {
	protected static final double EPSILON = 0.00001;
	
	protected final Polynomial first;
    protected final Polynomial second;
    protected final double[] coefficientsFirst;
    protected final double[] coefficientsSecond;
     
	protected PolynomialBaseTest(double[] coeffsFirst, double[] coeffsSecond) {
		first = build(coeffsFirst);
		second = build(coeffsSecond);
		
		coefficientsFirst = Arrays.copyOf(coeffsFirst, coeffsFirst.length);
		coefficientsSecond = Arrays.copyOf(coeffsSecond, coeffsSecond.length);
	}
	
	protected static double[] mkarr(double... x) {
		return x;
	}

	protected static Polynomial build(double... coefs) {
		Polynomial result = new Polynomial(coefs);
		assertEquals(result, coefs);
		return result;
	}
	
	protected static void assertEquals(Polynomial actual, double... expectedCoefs) {
		assertNotNull("polynomial ought not to be null", actual);
		
		double[] actualCoefs = actual.getCoefficients();
		assertNotNull("coefficients ought not to be null", actualCoefs);
		
		assertArrayEquals(expectedCoefs, actualCoefs, EPSILON);
	}
}
