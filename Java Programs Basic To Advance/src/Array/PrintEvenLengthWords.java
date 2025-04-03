package Array;

public class PrintEvenLengthWords {

	public static void isEvenLenWord(String s) {

		for (String str : s.split(" ")) {
			if (str.length() % 2 == 0) {
				System.out.print(str + " ");
			}
		}
	}

	public static void main(String[] args) {
		String s = "hello world welcome to java programming session";
		isEvenLenWord(s);
	}
}
