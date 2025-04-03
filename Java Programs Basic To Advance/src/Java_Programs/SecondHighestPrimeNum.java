package Java_Programs;

import java.util.Scanner;

public class SecondHighestPrimeNum {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range = sc.nextInt();
		int highestPrime = -1;
		int secondHighestPrime = -1;

		for (int i = 2; i <= range; i++) {
			if (isPrime(i)) {
				secondHighestPrime = highestPrime;
				highestPrime = i;
			}
		}

		if (secondHighestPrime != -1) {
			System.out.println("Second highest prime number: " + secondHighestPrime);
		} else {
			System.out.println("No second highest prime number found.");
		}

		sc.close();
	}
}
