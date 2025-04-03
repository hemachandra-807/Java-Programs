
public class LongestPossibleSubstring {

	public static void main(String[] args) {

		String str = "banana";
		String longestSubstring = "";
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				String temp = str.substring(i, j);
				if (temp.length() > longestSubstring.length()) {
					longestSubstring = temp;
				}
			}
		}
		System.out.println(longestSubstring);
	}
}