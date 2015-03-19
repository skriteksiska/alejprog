package cz.alisma.alej.houska.L23;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
 
public class HashMapFrequency <E> implements Frequency<E> {
    private Map<E, Long> values;
    long totalCount;
 
    public HashMapFrequency() {
        values = new HashMap<E, Long>();
        totalCount = 0;
    }
 
    public void add(E value) {
        Long countNow = values.get(value);
        if (countNow == null) {
            values.put(value, (long) 1);
        } else {
            values.put(value, countNow + 1);
        }
        totalCount++;
    }
 
    public long get(E value) {
        Long count = values.get(value);
        if (count == null) {
            return 0;
        } else {
            return count;
        }
    }
 
    public Collection<E> getValues() {
        return Collections.unmodifiableCollection(values.keySet());
    }
 
    public long getTotalCount() {
        return -1;
    }
}