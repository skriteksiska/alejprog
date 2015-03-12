import java.util.Map;
import java.util.HashMap;

public class Cetnosti {
    public static void main(String[] args) {
		Map<Integer,Integer> cetnosti = new HashMap<Integer,Integer>();
		
        int cislo;
    	Integer pom;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (scanner.hasNextInt()) {
            cislo = scanner.nextInt();
            
            pom = cetnosti.get(cislo);
            if (pom == null) {
				cetnosti.put(cislo, 1);
			}
			else {
				cetnosti.put(cislo, pom+1);
			}
        }   
        
        Object[] cisla = cetnosti.keySet().toArray();
        for (int i=0; i < cisla.length; i++) {
            System.out.printf("%3d tam bylo %dx.\n", cisla[i],
                cetnosti.get(cisla[i]));
        }
    }
}