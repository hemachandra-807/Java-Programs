package String_Programs;

public class RemoveDuplicatesWithoutFuntions {

	public static void main(String[] args) {
		String s1 = "banana";
		String s2 = "";

		char[] carr = s1.toCharArray();

		for (int i = 0; i < carr.length; i++) {
			char ch = carr[i];
			boolean isDuplicate = false;

			for (int j = 0; j < s2.length(); j++) {
				if (s2.toCharArray()[j] == ch) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				s2 += ch;
			}
		}
		System.out.println(s2);
	}
}
