
public class ReplaceLargestElementToLeft {

	public static void main(String[] args) {
		int arr[] = { 12, 56, 108, 25, 75, 17, 80 };

		int max = arr[0];
		for (int i=0;i<arr.length;i++) {
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
