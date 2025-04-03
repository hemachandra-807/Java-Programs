
public class Isomarphic {

	static String countSquenceFreq(String s) {
		s = s + " ";
		String ans = "";
		int c = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;
			} else {
				ans = ans + c;
				c = 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "xxyzz";

		if (countSquenceFreq(s1).equals(countSquenceFreq(s2))) {
			System.out.println("Isomarphic");
		} else {
			System.out.println("Not a Isomarphic");
		}
	}
}
