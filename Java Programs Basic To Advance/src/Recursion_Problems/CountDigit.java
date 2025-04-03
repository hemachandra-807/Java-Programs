package Recursion_Problems;

import java.util.Scanner;

public class CountDigit {

	public static int isCount(int num) {
		if (num == 0)
			return 1;
		return 1 + isCount(num / 10);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println(isCount(num));
		sc.close();
	}
}
