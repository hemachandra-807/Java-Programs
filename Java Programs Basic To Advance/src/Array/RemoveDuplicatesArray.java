package Array;

import java.util.Arrays;

public class RemoveDuplicatesArray {

	/*
	 * Inputs: int[] A = {1, 2, 4, 6, 7, 2, 4};
	 * 
	 * Output: [1, 2, 4, 6, 7 ]
	 * 
	 */

	public static int[] removeDuplicates(int[] array) {
		int[] temp = new int[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < index; j++) {
				if (array[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				temp[index++] = array[i];
			}
		}
		return   Arrays.copyOf(temp, index);
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 4, 6, 7, 2, 4 };

		System.out.println(Arrays.toString(removeDuplicates(A)));

	}
}