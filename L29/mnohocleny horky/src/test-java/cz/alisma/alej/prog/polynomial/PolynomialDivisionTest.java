package cz.alisma.alej.prog.polynomial;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PolynomialDivisionTest extends PolynomialBaseTest {
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ "(0) / (3 - x)",
				mkarr(0.), mkarr(3., -1.), mkarr(0.), mkarr(0.) },
			{ "(10) / (5)",
				mkarr(10.), mkarr(5.), mkarr(2.), mkarr(0.) },
			{ "(8 + 4x) / 2",
				mkarr(8., 4.), mkarr(2.), mkarr(4., 2.), mkarr(0.)  },
			{ "(2 + x + 2x^2 + 3x^3) / (1 + x)",
				mkarr(2., 1., 2., 3.), mkarr(1., 1.), mkarr(2., -1., 3), mkarr(0.) },
			{ "(18 - 4x^2) / (4 - 2x)",
				mkarr(18., 0., -4.), mkarr(4., -2.), mkarr(4., 2.), mkarr(2) }
		});
	}

	private double[] coefficientsAfterDivision;
	private double[] coefficientsOfTheRemainder;

	public PolynomialDivisionTest(String nameIgnoredHere,
			double[] coeffsA, double[] coeffsB,
			double[] coeffsResult, double[] coeffsRemain) {
		super(coeffsA, coeffsB);
		
		coefficientsAfterDivision = coeffsResult;
		coefficientsOfTheRemainder = coeffsRemain;
	}

	@Test
	public void dividingWorks() {
		Polynomial rem = first.divideBy(second);

		assertEquals(first, coefficientsAfterDivision);
		assertEquals(rem, coefficientsOfTheRemainder);
		
		/* Check we have not by accident modified the second operand. */
		assertEquals(second, coefficientsSecond);
	}
	
	@Test(expected=ArithmeticException.class)
	public void dividingByZeroThrows() {
		Polynomial zero = build(0.);
		
		first.divideBy(zero);
	}
}
