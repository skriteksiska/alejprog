import cz.alisma.alej.prog.collections.Collection;
import cz.alisma.alej.prog.collections.UnresizableStringArray;
import cz.alisma.alej.prog.collections.UnresizableIntArray;

public class Trideni { 
	public static void print(Collection col) {
	    for (int i = 0; i < col.size(); i++) {
	        System.out.printf("[%3d]: %s\n", i, col.getAsString(i));
	    }
	}
	 
	public static void main(String[] args) {
	 
	    UnresizableStringArrayNewMeta strings = new UnresizableStringArrayNewMeta("xyi", "abcd");
	    print(strings);
	    
	    // trizeni
	    boolean setrizeno = false;
		while (!setrizeno) {
			setrizeno = true;
			for (int i=0; i < strings.size()-1; i++) {
				if (!strings.isLessThan(i, i+1)) {
					setrizeno = false;
					strings.swap(i, i+1);
				}
			}	
		}
	
	    print(strings);
	 
	    UnresizableIntArray ints = new UnresizableIntArray(4, 5, 2, 3);
	    // Analogicky
	    print(ints);
	    setrizeno = false;
		while (!setrizeno) {
			setrizeno = true;
			for (int i=0; i < ints.size()-1; i++) {
				if (!ints.isLessThan(i, i+1)) {
					setrizeno = false;
					ints.swap(i, i+1);
				}
			}	
		}
		print(ints);
	}
}