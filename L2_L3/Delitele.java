public class Delitel {
    public static void main (String[] args) {
        int x = Integer.valueOf(args[0]);
        
        for (int i=1; i <= x; i++) {
           if (x%i == 0) {
              System.out.printf("%d ", i);
           }
        }
    }
}