public class Nasobky {
    public static void main (String[] args) {
        for (int i=1; i*3<30; i++) {
            System.out.printf("%d ", i*3);
            if (i%4 == 0) {
               System.out.printf("\n");
            }
        }
    }
}