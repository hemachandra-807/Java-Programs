public class ReverseWordWise {

	public static String reverseStringwordwise(String input) {
		String[] words = input.split(" ");
		StringBuilder reverseSentence = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			StringBuilder reverseWord = new StringBuilder(word);
			reverseSentence.append(reverseWord.reverse()).append(" ");
		}
		return reverseSentence.toString().trim();
	}

	public static void main(String[] args) {

		String s = "Welcome to java";

		String result = reverseStringwordwise(s);

		System.out.println(result);
	}
}
