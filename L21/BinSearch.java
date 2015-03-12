public class BinSearch {
    private static int binSearch(int[] where, int what) {
        int indexMax = where.length - 1;
        int indexMin = 0;
        int indexNovy;
        
        while (true) {
        	// hotovo
            if (indexMin == indexMax) {
				if (indexMin == what) {
					return indexMin;
				}
				else {
					throw new IllegalArgumentException("");
				}
			}
        
        	// puleni
			indexNovy = (indexMax + indexMin) / 2;
			if (where[indexNovy] <= what) {
				indexMin = indexNovy + 1;
			}
			else {
				indexMax = indexNovy;
			}
			System.out.printf("%d %d\n", indexMin, indexMax);
		}
    }
 
    private static void show(int value, int expectedIndex, int... array) {
        System.out.printf("Searching for %d in [", value);
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.printf(", ");
            }
            System.out.printf("%d", array[i]);
        }
        System.out.printf("]: ");
 
        int idx = binSearch(array, value);
        System.out.printf("%d (expected %d).\n", idx, expectedIndex);
    }
 
    public static void main(String[] args) {
        //show(3, -1, 2, 4, 6, 8, 10, 12);
        show(2, 0, 2, 4, 6, 8, 10, 12, 14, 16);
        show(7, 3, 3, 4, 5, 7, 8, 24, 31, 33, 39, 42, 43);
    }
}