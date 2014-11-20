
public class ZkouseniZcitani {
	public static void main(String[] args) {
		java.util.Random nahoda = new java.util.Random();
		java.util.Scanner vstup = new java.util.Scanner(System.in);
		int zbyvaSplnit = 20;
		int spatne = 0;
		int a, b;
		
		a = nahoda.nextInt(20);
		b = nahoda.nextInt(20);
		while (a+b >= 20) {
			b = nahoda.nextInt(20);
		}
		
		while (zbyvaSplnit > 0) {			
			System.out.printf("Kolik je %d + %d? ", a, b);
			
			if (vstup.nextInt() == a+b) {
				zbyvaSplnit--;
				a = nahoda.nextInt(20);
				b = nahoda.nextInt(20);
				while (a+b >= 20) {
					b = nahoda.nextInt(20);
				}
			}
			else {
				spatne++;
				System.out.printf("To neni spravne.\n");
			}
		}
		
		System.out.printf("\n Na spocteni 20 pokusu jste potrebovali %d pokusu.\n", 20+spatne);
	}
}
