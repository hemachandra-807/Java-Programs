// convert all the lower case into upper case and all upper case into lower case
public class CharacterManipulation {
	public static void main(String[] args) {
		String s = "JspidErs@123Hi";
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {

				c += 32;
				ans = ans + c;
			} else if (c >= 'a' && c <= 'z') {
				c -= 32;
				ans = ans + c;
			} else {
				ans = ans + c;
			}
		}
		System.out.println(ans);

	}
}
