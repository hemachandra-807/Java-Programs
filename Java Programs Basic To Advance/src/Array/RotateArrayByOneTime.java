package Array;

import java.util.Arrays;

public class RotateArrayByOneTime {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(a);
		System.out.println(Arrays.toString(a));
	}

	public static void rotate(int[] a) {
		int len = a.length;
		int temp = a[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;
	}

}
