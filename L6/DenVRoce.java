public class DenVRoce {
	public static void main(String[] args) {
		int rok = Integer.parseInt(args[0]);
		int mesic = Integer.parseInt(args[1]);
		int den = Integer.parseInt(args[2]);
		
		int denVRoce = den;
		
		int[] delkyMesicu = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int m=0; m < mesic-1; m++) {
			denVRoce += delkyMesicu[m];
		}
		
		// prestupny rok
		if (rok%4 == 0) {
			if ((rok%100 != 0) || (rok%400 == 0)) {
				if (mesic > 2) {
					denVRoce++;
				}
			}
		}
		
		System.out.printf("Zadal jste %d. den v roce %d.", denVRoce, rok);
	}
}