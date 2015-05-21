package cz.alisma.alej.prog.polynomial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntToDoubleMapWithAdding {
	private static final double EPSILON = 0.00001;
	
	private Map<Integer, Double> map = new HashMap<>();
	
	public IntToDoubleMapWithAdding() {
		
	}
	
	public IntToDoubleMapWithAdding(IntToDoubleMapWithAdding other) {
		for (int i : other.getNonZeroIndexesUnsorted()) {
			set(i, other.get(i));
		}
	}
	
	public boolean isEmpty() {
		return map.isEmpty();
	}

	public double get(int index) {
		Double value = map.get(index);
		if (value == null) {
			return 0.;
		} else {
			return value;
		}
	}
	
	public int getHighestIndex() {
		int highest = 0;
		for (Integer i : map.keySet()) {
			if (i > highest) {
				highest = i;
			}
		}
		return highest;
	}
	
	public int[] getNonZeroIndexesUnsorted() {
		Set<Integer> keys = map.keySet();
		int[] result = new int[keys.size()];
		int idx = 0;
		for (Integer k : keys) {
			result[idx] = k;
			idx++;
		}
		return result;
	}
	
	public void set(int index, double value) {
		if (isZero(value)) {
			map.remove(index);
		} else {
			map.put(index, value);
		}
	}
	
	public void add(int index, double value) {
		set(index, get(index) + value);
	}
	
	private static boolean isZero(double value) {
		return (value > -EPSILON) && (value < EPSILON);
	}
}
