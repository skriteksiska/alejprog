import cz.alisma.alej.prog.collections.SortableCollection;

public class UnresizableStringArrayNewMeta implements SortableCollection {
	private int size;
	private java.util.List<String> seznam;
	
	/** Tells number of elements in the collection. */
    public int size() {
		return this.size;
	}
    /** Returns element at given index as String regardless of the actual type. */
    public String getAsString(int index) {
		//return "Tricet!";
	    return this.seznam.get(index);
	}
    /** Tells whether element at index1 is smaller than element at index2. */
    public boolean isLessThan(int index1, int index2) {
	    if (this.seznam.get(index1).length() < this.seznam.get(index2).length()) {
			return true;
		}
		else {
			return false;
		}
	}
    /** Swaps two elements of the collection at given indices. */
    public void swap(int index1, int index2) {
		String pom = this.seznam.get(index1);
		this.seznam.set(index1, seznam.get(index2));
		this.seznam.set(index2, pom);
	}
    
    public UnresizableStringArrayNewMeta(String ... vstupy) {
    	 size = 0;
    	 this.seznam = new java.util.LinkedList<String>();
		 for (String vstup : vstupy) {
    	 	size++;
		 	this.seznam.add(vstup);	
		 }
	}
}