package cz.alisma.alej.prog.polynomial;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PolynomialMultiplicationTest extends PolynomialBaseTest {
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ "(2) * (5)",
				mkarr(2.), mkarr(5.), mkarr(10.) },
			{ "(2x) * (5 + x)",
				mkarr(0., 2.), mkarr(5., 1.), mkarr(0., 10., 2.) },
			{ "(1 + x) * (2 - x + 3x^2)",
				mkarr(1., 1.), mkarr(2., -1., 3), mkarr(2., 1., 2., 3.) },
			{ "(4 + 2x) * (4 - 2x)",
				mkarr(4., 2.), mkarr(4., -2.), mkarr(16., 0., -4) },
			{ "(-2 + 4x) * (0)",
				mkarr(-2., 4.), mkarr(0.), mkarr(0.) }
		});
	}

	private double[] coefficientsAfterMultiplication;

	public PolynomialMultiplicationTest(String nameIgnoredHere,
			double[] coeffsA, double[] coeffsB, double[] coeffsResult) {
		super(coeffsA, coeffsB);
		
		coefficientsAfterMultiplication = coeffsResult;
	}

	@Test
	public void multiplicationWorks() {
		first.multiplyBy(second);

		assertEquals(first, coefficientsAfterMultiplication);
		
		/* Check we have not by accident modified the second operand. */
		assertEquals(second, coefficientsSecond);
	}
}
