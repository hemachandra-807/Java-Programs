package String_Programs;

public class ReverseWords {

	public static String reverse(String s) {
		int i = 0, j = 0;
		String s2 = "";
		while (j < s.length()) {
			while (j < s.length() && s.charAt(i) != ' ') {
				j++;
			}
			String temp = " ";
			int k = j - 1;
			while (k >= i) {
				temp += s.charAt(k);
				k--;
			}
			s2 += temp;
			if (j < s.length()) {
				s2 += "";
				j++;
				i = j;
			}
		}
		return s2;
	}

	public static void main(String[] args) {

		String s = "java is easy";
		System.out.println(reverse(s));
	}
}
