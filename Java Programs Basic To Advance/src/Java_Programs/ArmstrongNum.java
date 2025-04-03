package Java_Programs;

import java.util.Scanner;

public class ArmstrongNum {

	static int digitCount(int num) {
		int digit = 0;
		do {
			num /= 10;
			digit++;
		}while (num > 0);
		return digit;
	}

	static boolean isArmStrong(int num) {
		int sum = 0, rem = 0;
		int original = num;
		int digits=digitCount(num);
		do {
			rem = num % 10;
			sum = sum + isPow(rem, digits);
			num = num / 10;
		} while (num > 0);
		return sum == original;
	}

	static int isPow(int base, int expo) {
		int pow = 1;
		for (int i = 1; i <= expo; i++) {
			pow = pow * base;
		}
		return pow;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check Arstrong or not: ");
		int num = sc.nextInt();

		if (isArmStrong(num)) {
			System.out.println("ArmStrong number");
		} else {
			System.out.println("Not a ArmStrong number");
		}
		sc.close();
	}
}
