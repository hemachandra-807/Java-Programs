package String_Programs;

public class Permutation {

	public static String swap(String s, int i, int j) {
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return new String(a);
	}

	public static void main(String[] args) {

		String s = "abc";
		int end = s.length() - 1;
		
		for (int i = 0; i <= end; i++) {
			String s1 = swap(s, 0, i);

			for (int j = 1; j <= end; j++) {
				String s2 = swap(s1, 1, j);

				for (int k = 2; k <= end; k++) {
					String s3 = swap(s2, 2, k);
					System.out.println(s3);
				}
			}
		}
	}
}
