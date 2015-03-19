package cz.alisma.alej.houska.L23;

import java.util.Set;

public interface Synonyms <E> {
    /** Make all the values synonyms. */
    void set(E... synonyms);
    /** Get synonyms for a given value (excluding that value). */
    Set<E> get(E value);
    /** Get all known synonyms. */
    Set<Set<E>> getAll();
}