package cz.alisma.alej.prog.houska.lekce11;

import java.io.IOException;

public class CetnostSlov {
	public static void main(String args[]) throws IOException {
		String vstupSlovo = "";
		int znak;
		
		Cetnosti cetnosti = new Cetnosti();
		
		while (true) {
		    znak = System.in.read();
		    if (znak == -1) {	// Konec vstupu.
		        break;
		    }
		    
		    if ((vstupSlovo != "") && (((char)znak == ' ') || ((char)znak == '\n'))) {
		    	cetnosti.zapocitej(vstupSlovo);System.out.println("s"+vstupSlovo+"s");
		    	vstupSlovo = "";
		    }
		    else {
				vstupSlovo += (char) znak;
		    }
		}

    	if (vstupSlovo != "") {
    		cetnosti.zapocitej(vstupSlovo);
    	}
		
		String[] pom = cetnosti.seznamCisel();
		for (int i=0; i < pom.length; i++) {
			System.out.printf("Slovo %s se vyskytovalo %dkrat.\n", pom[i], cetnosti.cetnost(i));
		}
		
	}
}
