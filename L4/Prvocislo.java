public class Prvocislo {
    public static void main(String[] args) {
        int cislo = Integer.valueOf(args[0]);
        boolean jePrvocislo = true;
        int i = 2;
        
        while (jePrvocislo && (i < cislo)) {
            if (cislo % i == 0) {
                jePrvocislo = false;
            }
            i++;
        }
        
        if (jePrvocislo) {
        	System.out.printf("Cislo %d je prvocislo.", cislo);
        }
        else {
            System.out.printf("Cislo %d neni prvocislo.", cislo);
        }
    }
}