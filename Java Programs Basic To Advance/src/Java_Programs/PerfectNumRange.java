package Java_Programs;

import java.util.Scanner;

public class PerfectNumRange {

	public static boolean isPerfect(int num) {
		int sum = 0, original = num;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum == original ? true : false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to chect perfect number or not: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (isPerfect(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
