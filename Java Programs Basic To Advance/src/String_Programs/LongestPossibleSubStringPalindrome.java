package String_Programs;

public class LongestPossibleSubStringPalindrome {

	public static void main(String[] args) {

		String s = "mahalakshmi";
		String longestSubStringPalindrome = isSubString(s);

		System.out.println(longestSubStringPalindrome);
	}

	public static String isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0, j = s.length() - 1;

		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return null;
			i++;
			j--;
		}
		return s;
	}

	public static String isSubString(String str) {
		String longestSubstring = "";
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				String temp = str.substring(i, j);

				String result = isPalindrome(temp);
				if (result != null && result.length() > longestSubstring.length()) {
					longestSubstring = result;
				}
			}
		}
		return longestSubstring;
	}
}
