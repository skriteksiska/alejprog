import java.io.PrintWriter;

public class SudaLicha {
    public static void main(String[] args) throws java.io.IOException {
        PrintWriter suda = new PrintWriter("suda.txt");
        PrintWriter licha = new PrintWriter("licha.txt");
        
        int n = Integer.parseInt(args[0]);
        
        while (n > 0) {
        	n--;
        	if (n % 2 == 0) {
				suda.printf("%d ", n);
			}
			else {
			    licha.printf("%d ", n);
			}
		}
		
		suda.close();
		licha.close();
    }
}