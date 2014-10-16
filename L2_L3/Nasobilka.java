public class Nasobilka {
    public static void main (String[] args) {
        for (int i=1; i <= 10; i++) {
            for (int j=1; j <= 10; j++) {
                //if (i*j < 10) System.out.printf(" ");
                //if (i*j < 100) System.out.printf(" ");
                System.out.printf("%3d ", i*j);    
            }
            System.out.printf("\n");
        }
    }
}