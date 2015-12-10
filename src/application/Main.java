package application;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] foo = {1, 0, 2, 9, 3, 8, 4, 7, 5, 6};
		Integer[] oof = {6, 5, 7, 4, 8, 3, 9, 2, 0, 1};
		Integer[] fooCopy;
		ArrayReverser<Integer> bar = new ArrayReverser<Integer>();
		
		
		fooCopy = foo.clone();
		bar.reverseForLoop(fooCopy);
		reportResult("reverseForLoop()", fooCopy, oof);
		
		fooCopy = foo.clone();
		bar.reverseWhileLoop(fooCopy);
		reportResult("reverseWhileLoop()", fooCopy, oof);
		
		fooCopy = foo.clone();
		bar.reverseRecurse(fooCopy);
		reportResult("reverseRecurse()", fooCopy, oof);
		
		fooCopy = foo.clone();
		bar.reverseNoFourLoop(fooCopy);
		reportResult("reverseNoFourLoop()", fooCopy, oof);
		
		fooCopy = foo.clone();
		bar.reverseCollection(fooCopy);
		reportResult("reverseCollection()", fooCopy, oof);

	}
	
	private static void reportResult(String methodName, Integer[] foo, Integer[] oof) {
		System.out.println(methodName + ": " + checkReversed(foo, oof));
	}
	
	private static boolean checkReversed(Integer[] foo, Integer[] oof) {
		for(int i = 0; i < foo.length; i++) {
			if(foo[i]!=oof[i]) { return false; }
		} return true;
	}
	
}
