package Recursion_Problems;

public class SecondMaxPrimeNum {

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
		int maxPrime = -1, secondMaxPrime = -1;
		for (int i = start; i <= end; i++) {
			if (isPrime(i, i / 2)) {
				if (i > maxPrime) {
					secondMaxPrime = maxPrime;
					maxPrime = i;
				} else if (i > secondMaxPrime) {
					secondMaxPrime = i;
				}
			}
		}

		if (secondMaxPrime != -1) {
			System.out.println(secondMaxPrime);
		}
	}
}
