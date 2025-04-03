import java.util.*;

public class OddSort_Left_n_EvenSort_Right {
	public static void sortOddEven(int[] nums) {

		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

		for (int num : nums) {
			if (num % 2 != 0) {
				oddNumbers.add(num);
			} else {
				evenNumbers.add(num);
			}
		}
		Collections.sort(oddNumbers, Collections.reverseOrder());
		Collections.sort(evenNumbers);

		ArrayList<Integer> finalArray = new ArrayList<Integer>(oddNumbers);
		finalArray.addAll(evenNumbers);
		System.out.println(finalArray);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 6, 1, 5, 7, 8 };

		sortOddEven(arr);
	}
}