import java.io.FileReader;
import java.io.IOException;

public class NejdelsiRadek {

	public static String nejdelsiRadekSouboru(String adresa) throws IOException {
		FileReader soubor = new FileReader(adresa);
        java.util.Scanner sc = new java.util.Scanner(soubor);
		
		String nej = "", novy = "";
		
		while (sc.hasNextLine()) {
			novy = sc.nextLine();
			
			if (novy.length() > nej.length()) {
				nej = novy;
			}
		}
		
		soubor.close();
		return nej;	
	}

    public static void main(String[] args) {
        
        String nej = "", novy = "";
        
        for (int i=0; i < args.length; i++) {
			try {
				novy = nejdelsiRadekSouboru(args[i]);
			} catch (IOException e) {
				continue;
			}
			
			if (novy.length() > nej.length()) {
				nej = novy;
			}				
		}
		
		System.out.printf("%s", nej);		
    }
}