package String_Programs;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("abcd"));
	}

	public static String reverse(String s) {
		char[] a = s.toCharArray();
		int i = 0, j = a.length - 1;

		while (i < j) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		return new String(a);
	}
}
