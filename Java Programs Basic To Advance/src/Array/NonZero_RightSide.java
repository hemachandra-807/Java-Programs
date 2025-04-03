
public class NonZero_RightSide {
	public static void main(String[] args) {
		int arr1[] = { 55, 3, 0, 56, 8, 0, 12, 0, 34, 0, 0, 71 };

		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				count++;
			}
		}

		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > 0) {
				arr2[count] = arr1[i];
				count++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
