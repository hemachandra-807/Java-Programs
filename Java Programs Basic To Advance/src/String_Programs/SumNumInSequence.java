package String_Programs;

public class SumNumInSequence {

	public static void main(String[] args) {
		String str = "12a123";
		int sum = 0, num = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				num = num * 10 + (ch - '0');
			} else {
				sum = sum + num;
				num = 0;
			}
		}
		sum = sum + num;
		System.out.println(sum);
	}
}
