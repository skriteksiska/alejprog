public class Canvas {
    private static final boolean DEBUG = false;
     
    private double minX;
    private double maxX;
    private double minY;
    private double maxY;
    private double scaleX;
    private double scaleY;
     
    private int width;
    private int height;
    private boolean[][] canvas;
     
    public Canvas(double minX, double maxX, double minY, double maxY, double scale) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.scaleX = scale;
        this.scaleY = scale;
         
        this.width = (int) Math.round((maxX - minX) / scaleX);
        this.height = (int) Math.round((maxY - minY) / scaleY);
         
        this.canvas = new boolean[width][height];
        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                canvas[x][y] = false;
            }
        }
    }
     
    public void set(double x, double y) {
        int ix = (int) Math.round((x - minX) / scaleX);
        int iy = (int) Math.round((y - minY) / scaleY);
        if ((ix < 0) || (ix >= this.width) || (iy < 0) || (iy >= this.height)) {
            return;
        }
        canvas[ix][iy] = true;
    }
     
    public char[][] print(int sizeX, int sizeY) {
        char[][] result = new char[sizeX][sizeY];
         
        for (int x = 0; x < sizeX; x++) {
            int[] rangeX = getPrintingRange(x, sizeX, this.width);
             
            for (int y = 0; y < sizeY; y++) {
                int[] rangeY = getPrintingRange(y, sizeY, this.height);
                 
                if (DEBUG) {
                    System.out.printf("[%d x %d] => [%d x %d]: x = %d => [%d, %d]   y = %d => [%d, %d]\n",
                            width, height, sizeX, sizeY, x, rangeX[0], rangeX[1], y, rangeY[0], rangeY[1]);
                }
                 
                char symbol = ' ';
                for (int cx = rangeX[0]; cx < rangeX[1]; cx++) {
                    for (int cy = rangeY[0]; cy < rangeY[1]; cy++) {
                        if (canvas[cx][cy]) {
                            symbol = '#';
                            break;
                        }
                    }
                }
                result[x][y] = symbol;
            }
        }
        return result;
    }
     
    private int[] getPrintingRange(int offset, int targetSize, int sourceSize) {
        int start = (int) Math.round(((double) offset) * sourceSize / targetSize);
        int end = (int) Math.round(((double) offset + 1) * sourceSize / targetSize);
        if (end == start) {
            end++;
        }
        if (end > sourceSize) {
            end = sourceSize;
        }
         
        return new int[] { start, end };
    }
}