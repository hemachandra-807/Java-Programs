package Array;

import java.util.Arrays;

public class FindMissingNumUsingArray {

	public static void isMissing(Integer[] arr) {

		Arrays.sort(arr);
		int highest = arr[arr.length - 1];

		boolean[] present = new boolean[highest + 1];

		for (int num : arr) {
			present[num] = true;
		}

		for (int i = 0; i <= highest; i++) {
			if (!present[i]) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 3, 5, 1, 7, 4, 10, 11 };
		isMissing(arr);
	}
}
