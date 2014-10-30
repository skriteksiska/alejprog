public class Setrid {
    public static void vypisCisla(int[] pole, int pocet) {
        for (int i = 0; i < pocet; i++) {
            System.out.printf(" %d", pole[i]);
        }
        System.out.println();
    }
 
    public static int nactiCisla(int[] pole) {
        int pocet = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (scanner.hasNextInt() && (pocet < pole.length)) {
            pole[pocet] = scanner.nextInt();
            pocet++;
        }
        return pocet;
    }
 
    // V _delka_ je poèet platných prvkù, pole.length mùže být vìtší.
    public static void setridCisla(int[] pole, int delka) {
        for (int i = 0; i < delka; i++) {
            /*
             * Najdeme pozici nejmenšího prvku v poli _pole_ od indexu _i_ o
             * délce _delka_-_i_
             */
            int nejmensiPozice = najdiPoziciNejmensiho(pole, i, delka - i);
            vymen(pole, i, nejmensiPozice);
        }
    }
 
    public static void vymen(int[] pole, int pozice1, int pozice2) {
        int pomocne = pole[pozice1];
        pole[pozice1] = pole[pozice2];
        pole[pozice2] = pomocne;
    }
 
    public static int najdiPoziciNejmensiho(int[] pole, int startPozice,
            int delka) {
        int nejmensi = pole[startPozice];
        int nejmensiPozice = startPozice;
        for (int i = startPozice; i < startPozice + delka; i++) {
            if (pole[i] < nejmensi) {
                nejmensi = pole[i];
                nejmensiPozice = i;
            }
        }
        return nejmensiPozice;
    }
 
    public static void main(String[] args) {
        int[] cisla = new int[100];
        int pocet = nactiCisla(cisla);
        setridCisla(cisla, pocet);
        vypisCisla(cisla, pocet);
    }
}