
public class countSequenceFrequency {

	static String countSquenceFreq(String s) {
		s = s + " ";
		String ans = "";
		int c = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;
			} else {
				ans = ans + s.charAt(i)+ c+" ";
				c = 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s1 = "aaabbcc";

		System.out.println(countSquenceFreq(s1));
	}
}
