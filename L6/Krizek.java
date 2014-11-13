public class Krizek {
	public static void main(String[] args) {
		int velikost = Integer.parseInt(args[0]);
		
		for (int y=0; y < (2*velikost+2); y++) {
			for (int x=0; x < (2*velikost+3); x++) {
				if ((y >= velikost) && (y < velikost+2)) {
				    System.out.printf("X");
				}
				else {
					if ((x >= velikost) && (x < velikost+3)) {
						System.out.printf("X");
					}
					else {
						System.out.printf(" ");
					}
				} 
			}
			System.out.printf("\n");
		}
	}
}