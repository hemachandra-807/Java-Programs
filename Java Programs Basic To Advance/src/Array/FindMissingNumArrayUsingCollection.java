package Array;

import java.util.Collections;
import java.util.HashSet;

public class FindMissingNumArrayUsingCollection {

	public static void isMissing(Integer[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int nums : arr) {
			hs.add(nums);
		}
		
		int highest = Collections.max(hs);

		for (int i = 0; i <= highest; i++) {
			if (!hs.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 3, 5, 1, 7, 4, 10, 11 };
		isMissing(arr);
	}
}
