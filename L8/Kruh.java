public class Kruh {
	public static void kresli(int polomer) {
		for (int y = -polomer; y <= polomer; y++) {
			for (int x = -polomer; x <= polomer; x++) {
		    	if ((x*x + y*y) <= (polomer*polomer)) {
					System.out.printf("X");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
 
	// pro testovani 
	public static void ukaz(int polomer) {
		System.out.printf("==============================\n %d \n", polomer);
		kresli(polomer);
		System.out.printf("\n\n");
	}
 
	public static void main(String[] args) {
		kresli(Integer.parseInt(args[0]));
	}
}