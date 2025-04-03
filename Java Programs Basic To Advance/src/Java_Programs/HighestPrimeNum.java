package Java_Programs;

import java.util.Scanner;

public class HighestPrimeNum {

	public static boolean isPrime(int num) {
		boolean flag = true;
		if (num <= 1) {
			System.out.println("not a prime number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int highest = -1;

		for (int i = 2; i <= range; i++) {
			if (isPrime(i))
				highest = i;
		}
		if (highest != -1) {
			System.out.println("Highest prime number: " + highest);
		} else {
			System.out.println("No prime numbers found.");
		}
		sc.close();
	}
}
