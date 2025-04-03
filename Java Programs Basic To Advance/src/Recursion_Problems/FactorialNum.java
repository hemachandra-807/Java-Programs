package Recursion_Problems;

import java.util.Scanner;

public class FactorialNum {

	public static int isFact(int num) {
		if (num == 1 || num == 0)
			return 1;
		return num * isFact(num - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(isFact(sc.nextInt()));
		sc.close();
	}
}
