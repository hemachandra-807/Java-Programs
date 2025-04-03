package Java_Programs;

public class Encoder {

	public static String encode(String s, int len) {
		char[] a = s.toCharArray();
		char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		for (int i = 0; i < a.length; i++) {
			char c = a[i];
			a[i] = letters[((c - 97) + len) % 26];
		}
		return new String(a);
	}

	public static void main(String[] args) {
		String s = "jsp";
		String encoderstr = encode(s,15);
		System.out.println(encoderstr);
	}
}
