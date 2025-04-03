import java.util.*;

public class Happy_No_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] > max) {
				max = arr[i];
			}
			sum = sum + arr[i];
		}
		sum = sum - max;

		if (sum == max) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not A Happy Number");
		}
		sc.close();

	}
}
