package Java_Programs;

import java.util.Scanner;

public class PrimeStartEnd {

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
		int start = sc.nextInt();
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
		sc.close();
	}
}
