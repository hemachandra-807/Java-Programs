package Array;

import java.util.Arrays;

public class SortArrayWIthoutInbuilts {

	public static void main(String[] args) {

		String[] str = { "Carrot", "Orange", "Apple", "Mango", "Banana" };

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
