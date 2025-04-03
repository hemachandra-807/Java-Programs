package String_Programs;

public class AnagramWithoutInbuiltFun {

	public static String sort(String s) {
		char[] ch = s.toLowerCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "bdca";

		if (sort(s1).equals(sort(s2))) {
			System.out.println("Anagram");
		} else {
			System.out.println("is not Anagram");
		}
	}
}
