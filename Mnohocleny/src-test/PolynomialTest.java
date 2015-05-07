import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PolynomialTest {
	
	public static final double zaokrouhleni = 0.001;
	
	@Test
	public void testCoefficients() {
		Polynomial a = new Polynomial(2.0, 4.2, 2.1);
		
		assertArrayEquals(new double[] {2.0, 4.2, 2.1}, a.getCoefficients(), zaokrouhleni);
	}
	
	@Test
	public void testDegree() {
		Polynomial a = new Polynomial(2.0, 4.2, 2.1);
		
		assertEquals(2, a.getDegree(), zaokrouhleni);
	}
	
	@Test
	public void testSum() {
		Polynomial a = new Polynomial(2.0, 4.2, 2.1);
		Polynomial b = new Polynomial(-3.6, 1);
		a.add(b);
		
		assertArrayEquals(new double[] {2.0, 0.6, 3.1}, a.getCoefficients(), zaokrouhleni);
	}
	
	@Test
	public void testSubtract() {
		Polynomial a = new Polynomial(-2.0, 4.2, 2.1);
		Polynomial b = new Polynomial(53, 0, -3.6, 1);
		a.subtract(b);
		
		assertArrayEquals(new double[] {-53, -2.0, 7.8, 1.1}, a.getCoefficients(), zaokrouhleni);
		assertEquals(3, a.getDegree(), zaokrouhleni);
	}
	
	@Test
	public void testMultiply() {
		Polynomial a = new Polynomial(3, -1);
		Polynomial b = new Polynomial(1, 7);
		a.multiplyBy(b);
		
		assertArrayEquals(new double[] {3, 20, -7}, a.getCoefficients(), zaokrouhleni);
		assertEquals(2, a.getDegree(), zaokrouhleni);
	}
	
	@Test
	public void testDivide() {
		Polynomial a = new Polynomial(-1, 20, 5);
		Polynomial b = new Polynomial(4, -1);
		a.multiplyBy(b);
		
		assertArrayEquals(new double[] {-1, 5, -5}, a.getCoefficients(), zaokrouhleni);
		assertEquals(2, a.getDegree(), zaokrouhleni);
	}
			
			
	/*@Test
	public void testToString() {
		
	}*/
					
}
