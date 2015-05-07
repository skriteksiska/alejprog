public class MathUtils {
    public static int min(int... numbers) {
        int min = Integer.MAX_VALUE;
        
        for (int n : numbers) {
        	if (n < min) {
        		min = n;
        	}
        }
        
        return min;
    }
    
    public static int gcd(int... numbers) {
    	int answer = numbers[0];
    	
    	if (numbers.length == 1) {
    		return answer;
    	}
    	
    	for (int n : numbers) {
    		answer = gcdAux(n, answer);
    	}
    	
    	return answer;
    }
    
    private static int gcdAux(int a, int b) {
    	int answer = 1;
    	
    	for (int i=1; i <= a; i++) {
    		if (((a % i) == 0) && ((b % i) == 0)) {
    			answer = i;
    		}
    	}
    	
    	return answer;
    }
}