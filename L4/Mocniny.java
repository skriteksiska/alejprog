public class Mocniny {
    public static void main(String[] args) {
        int stop = Integer.valueOf(args[0]);
        int i = 0;
        while (i*i < stop) {
            System.out.printf("%d ", i*i);
            i++;
        }
    }
}