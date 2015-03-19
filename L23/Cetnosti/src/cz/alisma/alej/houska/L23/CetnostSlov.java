package cz.alisma.alej.houska.L23;

public class CetnostSlov {
    public static void main(String args[]) {
        Frequency<String> slova = new HashMapFrequency<String>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
 
        while (sc.hasNext()) {
            slova.add(sc.next());
        }
 
        for (String slovo : slova.getValues()) {
            System.out.printf("Slovo %s tam bylo %dx.\n", slovo,
                    slova.get(slovo));
        }
    }
}