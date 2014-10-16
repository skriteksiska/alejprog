// chybi vypocet smerodatne odchylky
public class Statistika {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double soucet = 0, min = Double.MAX_VALUE, max = 0, prumer = 0, odchylka = 0;
        double pom;
        int i = 0;
        
        while (sc.hasNextInt()) {
            i++;
            pom = sc.nextInt();
            soucet += pom;
            if (pom < min) {
                min = pom;
            }   
            if (pom > max) {
                max = pom;
            }
        }
        
        prumer = soucet / i;
        System.out.printf("Soucet cisel je %f.\n" +
                          "Nejmensi cislo je %f.\n" +
                          "Nejvetsi cislo je %f.\n" +
                          "Prumer cisel je %f.\n" +
                          "Smerodatna odchylka je %f.\n",
                          soucet, min, max, prumer, odchylka);
    }
}