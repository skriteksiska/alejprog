import java.io.FileReader;

public class MinMax {
    public static void main(String[] args) throws java.io.IOException {
        FileReader reader = new FileReader("cisla.txt");
        java.util.Scanner sc = new java.util.Scanner(reader);
        
        int min = Integer.MAX_VALUE,
        	max = Integer.MIN_VALUE,
        	pom;
        
        while (sc.hasNextInt()) {
			pom = sc.nextInt();
			if (pom < min) {
				min = pom;
			}
			if (pom > max) {
				max = pom;
			}
		}
		reader.close();
        
        System.out.printf("Nejmensi cislo bylo %d, nejvetsi bylo %d.", min, max);
    }
}