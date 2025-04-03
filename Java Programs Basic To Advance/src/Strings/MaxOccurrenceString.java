package Strings;

public class MaxOccurrenceString {

	public static void main(String[] args) {

		String str = "banana";

		String s2 = "";
		int maxCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (s2.indexOf(ch) != -1) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				s2 = ch + "" + count;
			} else if (count == maxCount) {
				s2 += " " + ch + count;
			}
		}
		System.out.print(s2);
	}
}
