package Java_Programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int num) {
		int rev = 0;
		int original = num;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return original == rev ? true : false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		if (isPalindrome(num)) {
			System.out.println("Is a Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
		sc.close();
	}
}
