public class Sude_cislo {
    public static void main (String[] args) {
    
        if (Integer.valueOf(args[0]) % 2 == 0) {
            System.out.println("Zadane cislo je sude.");
        }
        else {
            System.out.println("Zadane cislo je liche.");
        }
    }    
}