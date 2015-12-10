package application;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverser <T> {

	/**
	 * @param args
	 */
	public void reverseForLoop(T[] array) {
		int len = array.length;
		for(int i = 0; i < len/2; i++) {
			T tmp = array[i];
			array[i] = array[len-i-1];
			array[len-i-1] = tmp;
		}
	}
	
	public void reverseWhileLoop(T[] array) {
		int len = array.length;
		int i = 0;
		int limit = len/2;
		while(i < limit) {
			T tmp = array[i];
			array[i] = array[len-i-1];
			array[len-i-1] = tmp;
			i++;
		}
	}
	
	public void reverseRecurse(T[] array) {
		reverseHelper(array, 0);
	}
	
	public void reverseNoFourLoop(T[] array) {
		int len = array.length;
		for(int i = 4-len/2; i < 4; i++) {
			T tmp = array[i+len/2-4];
			array[i+len/2-4] = array[(len+1)/2-i+3];
			array[(len+1)/2-i+3] = tmp;
		}
	}
	
	public void reverseCollection(T[] array) {
		Collections.reverse(Arrays.asList(array));
	}
	
	private void reverseHelper(T[] array, int i) {
		int len = array.length;
		if(i<len/2) {
			T tmp = array[i];
			array[i] = array[len-i-1];
			array[len-i-1] = tmp;
			reverseHelper(array, ++i);
		} else return;
	}
}
