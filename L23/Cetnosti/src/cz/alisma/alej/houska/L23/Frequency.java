package cz.alisma.alej.houska.L23;

import java.util.Collection;

public interface Frequency <E> {
    void add(E value);
    long get(E value);
    Collection<E> getValues();
    long getTotalCount();
}