package com.patterns.porgrams;

public class PrimeNumberPattern {
	public static void main(String[] args) {
		int rows = 4;
		int num = 2; 

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				while (!isPrime(num)) {
					num++;
				}
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}