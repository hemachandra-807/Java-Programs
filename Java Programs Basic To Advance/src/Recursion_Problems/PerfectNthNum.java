package Recursion_Problems;

public class PerfectNthNum {

	public static int isPerfect(int num, int i, int sum) {
		if (i == 0)
			return sum;
		if (num % i == 0)
			sum = sum + i;
		return isPerfect(num, i - 1, sum);
	}

	public static void main(String[] args) {

		int maxPerfect = -1;
		for (int i = 1; i <= 10000; i++) {
			if (i == isPerfect(i, i / 2, 0)) {
				if (i > maxPerfect) {
					maxPerfect = i;
				}
			}
		}
		if (maxPerfect != -1) {
			System.out.println(maxPerfect);
		}
	}
}
