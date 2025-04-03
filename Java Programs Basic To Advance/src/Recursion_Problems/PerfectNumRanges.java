package Recursion_Problems;

public class PerfectNumRanges {

	public static int isPerfect(int num, int i, int sum) {
		if (i == 0)
			return sum;
		if (num % i == 0)
			sum = sum + i;
		return isPerfect(num, i - 1, sum);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			if (i == isPerfect(i, i / 2, 0)) {
				System.out.print(i + " ");
			}
		}
	}
}
