package Array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplictesFromTwoArrayAndMerge {

	/*
	 * Inputs: 
	 * int[] A = {1, 2, 4, 6, 7, 2, 4}; 
	 * int[] B = {1, 3, 5, 8, 2, 9, 3};
	 * 
	 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
	 * 
	 */

	public static int[] removeDuplicates_Merge(int[] array1, int[] array2) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int num1 : array1)
		{
			set.add(num1);
		}
		for(int num2 : array2)
		{
			set.add(num2);
		}
		
		return set.stream().mapToInt(Integer::intValue).sorted().toArray();
	}

	public static void main(String[] args) {
		int[] input1 = { 1, 2, 4, 6, 7, 2, 4 };
		int[] input2 = { 1, 3, 5, 8, 2, 9, 3 };
		
		System.out.println(Arrays.toString(removeDuplicates_Merge(input1, input2)));
	}
}
