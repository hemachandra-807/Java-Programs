package Recursion_Problems;

import java.util.Scanner;

public class FibonacciLogic_II {
	public static void isFibonacciSeries(int a, int b, int count) {
		if (count == 0)
			return;
		System.out.print(a + " ");
		isFibonacciSeries(b, a+b, count-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		isFibonacciSeries(sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.close();
	}
}
