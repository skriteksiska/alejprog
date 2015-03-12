import java.util.List;
import java.util.ArrayList;

public class Otoceni {
	public static void main(String[] args) {
	
		
		List<Integer> pole = new ArrayList<Integer>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
         
        while (sc.hasNextInt()) {
            pole.add(sc.nextInt());
        }
         
        for (int i = pole.size() - 1; i >= 0; i--) {
            System.out.printf("%d ", pole.get(i));
        }
         
        System.out.println();
	}
}