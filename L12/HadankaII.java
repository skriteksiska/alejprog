import java.util.Random;
 
public class HadankaII {  
    private static final int SIZE = 10000;
    private static final long LOOPS = 1000000;
 
    private static int randomFromRange(Random rnd, int lowerInc, int upperExc) {
        int diff = upperExc - lowerInc;
        return lowerInc + rnd.nextInt(diff);
    }
 
    private static boolean isInside(int x, int y, int r) {
        return x * x + y * y <= r * r;
    }
 
    public static void main(String[] args) {
        int inside = 0;
 
        Random rnd = new Random();
        for (long i = 0; i < LOOPS; i++) {
            int x = randomFromRange(rnd, - SIZE, SIZE + 1);
            int y = randomFromRange(rnd, - SIZE, SIZE + 1);
            if (isInside(x, y, SIZE)) {
                inside++;
            }
        }
 
        double p = 4.0 * (double) inside / LOOPS;
 
        System.out.printf("%.5f\n", p);
    }
}