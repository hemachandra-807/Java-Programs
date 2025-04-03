package Java_Programs;

import java.util.Scanner;

public class SpyNumber {

	public static boolean isSpyNumber(int num) {
		int rem = 0, sum = 0, product = 1;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num / 10;
		}
		return sum == product;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check Spy number or not: ");
		int num = sc.nextInt();

		System.out.println(isSpyNumber(num) ? "Spy number" : "not a Spy number");
		sc.close();
	}
}