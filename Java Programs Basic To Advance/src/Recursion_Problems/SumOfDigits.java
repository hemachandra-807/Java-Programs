package Recursion_Problems;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigit(int num) {
		if (num <= 9)
			return num;
		return sumOfDigit(num / 10) + (num % 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(sumOfDigit(sc.nextInt()));
		sc.close();
	}
}
