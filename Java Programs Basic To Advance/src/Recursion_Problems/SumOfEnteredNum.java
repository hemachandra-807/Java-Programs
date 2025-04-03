package Recursion_Problems;

import java.util.Scanner;

public class SumOfEnteredNum {

	public static int sum(int num) {
		if (num == 1)
			return 1;
		return num + sum(num - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(sum(sc.nextInt()));
		sc.close();
	}
}
                           