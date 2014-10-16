public class Maximum {
    public static void main(String[] args) {
        int max = 0, pom;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
            pom = sc.nextInt();
            if (pom > max) {
                max = pom;
            }   
        }
        System.out.println(max);
    }
}