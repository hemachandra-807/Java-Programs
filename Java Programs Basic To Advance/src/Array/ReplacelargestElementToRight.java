
public class ReplacelargestElementToRight {

	public static void main(String[] args) {
		int arr[] = { 12, 56, 108, 25, 75, 17, 80 };

		int max = arr[arr.length-1];
		for (int i=arr.length-1;i>=0;i--) {
			if (arr[i] >= max) {
				max=arr[i];
				arr[i]= -1;
			} else {
				arr[i] = max;
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
