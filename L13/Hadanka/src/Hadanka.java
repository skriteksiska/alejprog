public class Hadanka {
    private static final int MIN_X = -15;
    private static final int MAX_X = 15;
    private static final int MIN_Y = -4;
    private static final int MAX_Y = 4;
     
    private static final int WIDTH = 70;
    private static final int HEIGHT = 30;
     
    private static double function(double x) {
        //return Math.sin(x) + 1.5 * Math.sin(2*x / 3);
        return Math.tan(x / 2.0);
    }
     
    public static void main(String[] args) {
        Canvas canvas = new Canvas(MIN_X, MAX_X, MIN_Y, MAX_Y, 0.1);
         
        for (double x = MIN_X; x < MAX_X; x += 0.001) {
            canvas.set(x, function(x));
        }
         
        char[][] picture = canvas.print(WIDTH, HEIGHT);
        for (int y = HEIGHT-1; y >= 0; y--) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.printf("%c", picture[x][y]);
            }
            System.out.println();
        }
    }
}