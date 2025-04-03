package Recursion_Problems;

public class PrimeNumRanges {

	public static boolean isPrime(int num, int i) {
		if (num <= 1) {
			return false;
		}
		if (i == 1) {
			return true;
		}
		if (num % i == 0) {
			return false;
		}
		return isPrime(num, i - 1);
	}

	public static void main(String[] args) {
		int start = 2, end = 100;
		for (int i = start; i <= end; i++) {
			if (isPrime(i, i / 2)) {
				System.out.print(i + " ");
			}
		}
	}
}
