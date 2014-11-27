public class HadankaI {   
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int mini = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[j].length() < args[mini].length()) {
                    mini = j;
                }
            }
 
            System.out.printf("%s\n", args[mini]);
            args[mini] = args[i];
        }
    }
}