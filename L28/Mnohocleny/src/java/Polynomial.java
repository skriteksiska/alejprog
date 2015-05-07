import java.util.ArrayList;

public class Polynomial {
	private ArrayList<Double> coef;
	
    public Polynomial(double... newCoef) {
    	coef = new ArrayList<Double>();
    	
    	for (double c : newCoef) {
    		coef.add(c);
    	}
    }
    
    /*public Polynomial(double[] newCoef) {
    	coef = new ArrayList<Double>();
    	
    	for (for int i=0; i < newCoef.length; i++) {
    		coef.add();
    	}
    }*/
    
    public void add(Polynomial other) {
    	double[] second = other.getCoefficients();
    	
    	for (int i=1; i <= second.length; i++) {
    		if (i >= coef.size()) {
    			coef.add(0, second[second.length-i]);
    		}
    		else {
    			coef.set(coef.size()-i, coef.get(coef.size()-i) + second[second.length-i]);
    		}
    	}
    }
    
    public void subtract(Polynomial other) {
    	double[] second = other.getCoefficients();
    	
    	for (int i=1; i <= second.length; i++) {
    		if (i > coef.size()) {
    			coef.add(0, -second[second.length-i]);
    		}
    		else {
    			coef.set(coef.size()-i, coef.get(coef.size()-i) - second[second.length-i]);
    		}
    	}
    }
    
    public void multiplyBy(Polynomial other) {
    	double[] second = other.getCoefficients();
    	double[] newPolynom = new double[1 + (coef.size()-1) + (second.length-1)];
    	
    	for (int i=0; i < coef.size(); i++) {
    		for (int j=0; j < second.length; j++) {
    			newPolynom[i+j] += coef.get(i) * second[j];
    		}
    	}
    	
    	coef = new ArrayList<Double>();
    	for (int i=0; i < newPolynom.length; i++) {
    		coef.add(newPolynom[i]);
    	}
    }
    
    public Polynomial divideBy(Polynomial other) {
        Polynomial answer = new Polynomial();
        double begin = (other.getCoefficients())[0];
    	
        if (other.getDegree() > this.getDegree()) {
        	answer = new Polynomial(this.getCoefficients());
			coef = new ArrayList<Double>();
			return answer;
		}
        // else
    	
    	for (int i=0; i <= this.getDegree(); i++) {
			double[] field = new double[i-other.getDegree()+1];
			field[0] = coef.get(i) / begin;
			
			Polynomial pomPol = new Polynomial(field);
			answer.add(pomPol);
			pomPol.multiplyBy(other);
			this.subtract(pomPol);
		}    	
    	
    	Polynomial pom = new Polynomial(this.getCoefficients());
		    	
    	coef = new ArrayList<Double>();
    	for (double c : answer.getCoefficients()) {
    		coef.add(c);
    	}
    	return pom;
    }
    
    public double[] getCoefficients() {
    	double[] answer = new double[coef.size()];
    	for (int i=0; i < coef.size(); i++) {
    		answer[i] = coef.get(i);
    	}
    	return answer;
    }
    
    public int getDegree() {
    	return coef.size() - 1;
    }
    
    @Override
    public String toString() {
    	String answer = "";
    	for (int i=0; i < coef.size(); i++) {
    		answer += String.format("%dx^%d", coef.get(i), coef.size()-i);
    	}
    	
    	return answer;
    }
}