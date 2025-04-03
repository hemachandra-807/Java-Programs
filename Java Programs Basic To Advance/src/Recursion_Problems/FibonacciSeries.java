package Recursion_Problems;

import java.util.Scanner;

public class FibonacciSeries {
	static int n1=0,n2=1,n3;
	public static int isFibonacciSeries(int num) {
		if (num >0) {
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			isFibonacciSeries(num-1);
		}
		return n1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.print(isFibonacciSeries(sc.nextInt())+" ");
		sc.close();
	}
}
