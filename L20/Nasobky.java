import java.io.PrintWriter;

public class Nasobky {
    public static void main(String[] args) throws java.io.IOException {
        PrintWriter soubor = new PrintWriter("nasobky.txt");
        
        for (int i=0; i < 1000; i += 3) {
			soubor.printf("%d, ", i);
			if (i % 30 == 0) {
				soubor.println();
			}
		}
		
		soubor.close();
    }
}