public class Otoceni_cisel {
	public static void main(String[] args) {
		int pole[] = new int[100];
		int i = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while (sc.hasNextInt()) {
			pole[i] = sc.nextInt();
			i++;
		}
		
		while (i > 0) {
			i--;
			System.out.printf("%d ", pole[i]);
		}
	}
}