package cz.alisma.alej.prog.polynomial;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IntToDoubleMapWithAddingTest {
	private static final double EPSILON = 0.00001;
	
	private IntToDoubleMapWithAdding map;
	
	@Before
	public void setup() {
		map = new IntToDoubleMapWithAdding();
	}
	
	@Test
	public void nonExistentReturnZero() {
		assertEquals(0., map.get(0), EPSILON);
		assertEquals(0., map.get(1), EPSILON);
		assertEquals(0., map.get(2), EPSILON);
	}
	
	@Test
	public void setWorks() {
		map.set(1, 5.);
		map.set(4, 7.);
		assertEquals(0., map.get(0), EPSILON);
		assertEquals(5., map.get(1), EPSILON);
		assertEquals(0., map.get(2), EPSILON);
		assertEquals(0., map.get(3), EPSILON);
		assertEquals(7., map.get(4), EPSILON);
		assertEquals(0., map.get(5), EPSILON);
	}
	
	@Test
	public void addingWorks() {
		map.add(1, 5.);
		assertEquals(5., map.get(1), EPSILON);
		
		map.add(1, 7.);
		assertEquals(12., map.get(1), EPSILON);
	}
	
	@Test
	public void getHighestIndexWorksInSimpleCase() {
		map.add(2,  3.);
		map.add(4, 5.);
		
		assertEquals(4, map.getHighestIndex());
	}
	
	@Test
	public void getHighestIndexRecognizesZeroingOut() {
		map.set(1, 42.);
		map.set(3, 17.);
		
		assertEquals(3, map.getHighestIndex());
		
		map.add(3, -17.);
		assertEquals(1, map.getHighestIndex());
	}
}
