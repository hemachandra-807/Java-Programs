package Strings;

public class RemoveDuplicatesWithoutFun {

	public static void main(String[] args) {
		String s1 = "apple";

		String s2 = "";

		char[] carr = s1.toCharArray();
		for (int i = 0; i < carr.length; i++) {
			char c1 = carr[i];
			boolean isDuplicates = true;
			for (int j = 0; j < s2.length(); j++) {
				if (s2.toCharArray()[j] == c1) {
					isDuplicates = false;
					break;
				}
			}
			if (isDuplicates) {
				s2 = s2 + c1;
			}
		}
		System.out.println(s2);
	}
}
