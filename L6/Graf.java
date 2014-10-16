public class Graf {
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
		
		for (int j=0; j < i; j++) {
			for (int z=0; z < pole[j]/meritko; z++) {
				System.out.printf("#");
			}
			System.out.println();
		}
	}
}