public class Graf {
	public static void main(String[] args) {
		// nacteni vstupu
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
 
		KreslicGrafu kresli;
		
		if ((args.length == 0) || (args[0] == "0")) {
			kresli = new SloupcovyGrafNaObrazovku(hodnoty);
		}
		else {
			kresli = new SloupcovyGrafDoSvg(hodnoty);
		}
		
		kresli.vykresli(pocetHodnot, max);	
	}
}