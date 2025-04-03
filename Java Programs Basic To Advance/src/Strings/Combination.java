
public class Combination {

	public static void main(String[] args) {
		String str = "Jspiders";
		int l = 0, r = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			String temp = "";
			if (i % 2 == 0) {
				r--;
			} else {
				l++;
			}
			for (int j = l; j <= r; j++) {
				temp = temp + str.charAt(j)+" ";
			}
			System.out.println(temp);
		}
	}
}
