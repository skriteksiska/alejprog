public class Ramecek {
	
	public static void Help () {
		System.out.println("Chyba.\nProgram Ramecek ocekava jako prvni argument sirku vnitrinho obdelnika");
		System.out.println("a jako druhy argument vysku vnitrinho obdelnika.");
		System.exit(1);
	} 

	// arg[0]: sirka vnitrniho ramecku
	// arg[1]: vyska vnitrniho ramecku
	public static void main (String[] args) {
		
		if (args.length < 2) Help();

		int sirka = Integer.valueOf(args[0]);
		int vyska = Integer.valueOf(args[1]);
		
		if ((sirka < 0) || (vyska < 0)) Help();
		

		for (int i=-2; i < vyska+2; i++) {
			System.out.printf("XX");
			
			for (int j=0; j < sirka; j++) {
				
				if ((i>=0) && (i<vyska)) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("X");
				}
			}
			
			System.out.printf("XX\n");
		}
		
	}
}