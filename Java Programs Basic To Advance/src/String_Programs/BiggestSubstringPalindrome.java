package String_Programs;

public class BiggestSubstringPalindrome {

	public static void main(String[] args) {
		String s = "abcdleveladcmalayalamzjcracecar";
		String big = "";
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String temp = s.substring(i, j+1);
				String result = isPalindrome(temp);
				if (result!=null && result.length()>big.length() ) {
					big = result;
				}
			}
		}
		System.out.println(big);
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

}
