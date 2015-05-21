package cz.alisma.alej.prog.polynomial;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PolynomialSubtractionTest extends PolynomialBaseTest {
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ "(0) - (5)",
				mkarr(0.), mkarr(5.), mkarr(-5.) },
			{ "(2x) - (5)",
				mkarr(0., 2.), mkarr(5.), mkarr(-5., 2.) },
			{ "(7) - (5 + 3x)",
				mkarr(7.), mkarr(5., 3.), mkarr(2., -3.) },
			{ "(3 + 2x) - (1 + 2x)",
				mkarr(3., 2.), mkarr(1., 2.), mkarr(2.) },
			{ "(-2 + 4x) - (-2 + 4x)",
				mkarr(-2., 4.), mkarr(-2., 4.), mkarr(0.) }
		});
	}

	private double[] coefficientsAfterSubtraction;

	public PolynomialSubtractionTest(String nameIgnoredHere,
			double[] coeffsA, double[] coeffsB, double[] coeffsResult) {
		super(coeffsA, coeffsB);
		
		coefficientsAfterSubtraction = coeffsResult;
	}

	@Test
	public void subtractingWorks() {
		first.subtract(second);

		assertEquals(first, coefficientsAfterSubtraction);
		
		/* Check we have not by accident modified the second operand. */
		assertEquals(second, coefficientsSecond);
	}
}
