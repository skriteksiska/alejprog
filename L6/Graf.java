public class Graf {

   public static void vykresli(Double velikost) {
      for (int i=0; i < velikost; i++) {
				System.out.printf("#");
			}
   }

	public static void main(String[] args) {
		int pole[] = new int[100];
		int i = 0, max = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while (sc.hasNextInt()) {
			pole[i] = sc.nextInt();
			if (pole[i] > max) {
				max = pole[i];
			}
			i++;
		}
		
		Double meritko = max / 60.0;
		if (max < 60) {
         meritko = 1.0;
      }
      
		for (int j=0; j < i; j++) {
			vykresli(pole[j] / meritko);
			System.out.println();
		}
	}
}