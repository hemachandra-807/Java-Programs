
public class RemoveExtraSpace {

	public static void main(String[] args) {
		String str = "hello    hi   welcome    to java    programming   class";

		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i+1) == ' ') {
				continue;
			}
			ans = ans + str.charAt(i);
		}
		System.out.println(ans);
	}
}
