
public class FindLenWithoutLen {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int c = 0;
		try {
			for (int i = 0;; i++) {
				if (arr[i] >= 0) {
					c++;
				}
			}
		} catch (Throwable e) {

		}
		System.out.println(c);
	}
}



