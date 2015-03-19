package cz.alisma.alej.houska.L23;

import java.util.HashSet;
import java.util.Set;

public class MySynonyms<E> implements Synonyms<E> {
	
	Set<Set<E>> skupiny;
	
	public MySynonyms() {
		skupiny = new HashSet<Set<E>>();
	}
	
	@Override
	public void set(E... synonyms) {
		for (E prvekVstup : synonyms) {
			boolean nove = true;
			
			//Set<Integer> kdeJe = new HashSet<Integer>();
			
			for (Set<E> skupina : skupiny) {
				if (skupina.contains(prvekVstup)) {
										
					nove = false;
					for (E vstup : synonyms) {
						skupina.add(vstup);
					}
				}
			}
			
			if (nove) {
				Set<E> toto = new HashSet<E>();
				skupiny.add(toto);
				for (E vstup : synonyms) {
					toto.add(vstup);
				}
			}
			
		}
	}

	@Override
	public Set<E> get(E value) {
		Set<E> navrat = new HashSet<E>();
		
		for (Set<E> skupina : skupiny) {
			if (skupina.contains(value)) {
				for (E vystup : skupina) {
					navrat.add(vystup);
				}
			}
		}
		return null;
	}

	@Override
	public Set<Set<E>> getAll() {
		return skupiny;
	}

}
