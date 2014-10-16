public class Pyramida {
   public static void main (String[] args) {
       /*int a = 9, b = Integer.valueOf(args[0]);
       System.out.println("No cau.");
       System.out.println("\"\\\"");
       
       System.out.printf("Nein\n%d!\n%d:", 3*5-a, b/2);
       
       for (int i=0; i<100; i++) {
          System.out.printf("X");
       }*/
       
       int max = Integer.valueOf(args[0]);
       
       for (int i=0; i <= max*2; i += 2) {
          for (int f=0; f < (max*2-i)/2; f++) {
              System.out.printf(" ");
          }
          for (int j=0; j < i; j++) {
              System.out.printf("X");
              try{Thread.sleep(400/i);} catch (InterruptedException ie) {}
          }
          System.out.printf("\n");
          
       }
   }

}