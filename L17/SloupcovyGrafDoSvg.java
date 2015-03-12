public class SloupcovyGrafDoSvg implements KreslicGrafu {
    public void polozka(int velikost) {
        int maxVyska = 200;
        int[] hodnoty = new int[100];
        int pocetHodnot = 0;
        int max = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
            int cislo = sc.nextInt();
            if (cislo < 0) {
                continue;
            }
            hodnoty[pocetHodnot] = cislo;
            if (cislo > max) {
                max = cislo;
            }
 
            pocetHodnot++;
            if (pocetHodnot == hodnoty.length) {
                break;
            }
        }
 
        double prepocet = (double) (maxVyska) / max;
 
        System.out.println("<?xml version=\"1.0\"?>");
        System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\"");
        System.out.printf("width=\"%d\" height=\"%d\" viewBox=\"0 0 %d %d\">\n",
                pocetHodnot * 30 + 10, maxVyska + 20,
                pocetHodnot * 30 + 10, maxVyska + 20);
        for (int i = 0; i < pocetHodnot; i++) {
            int vyska = (int)(hodnoty[i] * prepocet);
            System.out.printf("<rect x=\"%d\" y=\"%d\" width=\"20\" height=\"%d\"",
                    i * 30 + 10, maxVyska - vyska + 10, vyska);
            System.out.println(" fill=\"blue\" stroke=\"black\" stroke-width=\"2\"/>");
        }
        System.out.println("</svg>");
    }
}