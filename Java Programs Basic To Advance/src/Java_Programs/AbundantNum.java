package Java_Programs;

import java.util.Scanner;

public class AbundantNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i < num; i++)
			if (num % i == 0) {
				sum = sum + i;
			}
		if (sum > num) {
			System.out.println("is Abundant number");
			System.out.println("The Anubdance is: " + (sum - num));
		} else {
			System.out.println(" is Not a Abundant number");
		}
		sc.close();
	}
}
