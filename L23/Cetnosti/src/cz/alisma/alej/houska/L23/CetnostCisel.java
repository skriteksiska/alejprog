package cz.alisma.alej.houska.L23;

public class CetnostCisel {
    public static void main(String args[]) {
        Frequency<Integer> cisla = new HashMapFrequency<Integer>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
 
        while (sc.hasNextInt()) {
            int cislo = sc.nextInt();
 
            cisla.add(cislo);
        }
 
        for (Integer cislo : cisla.getValues()) {
            long pocet = cisla.get(cislo);
            System.out.printf("Cislo %d tam bylo %dx.\n", cislo, pocet);
        }
    }
}