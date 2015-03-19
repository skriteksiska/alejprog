package cz.alisma.alej.houska.L23;

import java.util.Set;

public class UkazSynonyma {
    public static void main(String args[]) {
        Synonyms<String> syn = new MySynonyms<String>();
 
        syn.set("one", "jedna", "uno");
        syn.set("two", "dva");
        syn.set("eins", "une");
        syn.set("dva", "dos");
        syn.set("eins", "uno");
 
        for (Set<String> slova : syn.getAll()) {
            for (String slovo : slova) {
                System.out.printf(" %s", slovo);
            }
            System.out.println();
        }
    }
}