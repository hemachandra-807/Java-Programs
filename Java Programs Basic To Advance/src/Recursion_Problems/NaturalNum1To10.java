package Recursion_Problems;

import java.util.Scanner;

public class NaturalNum1To10 {

	public static void display(int start, int end) {
		if (start > end)
			return;
		System.out.print(start+" ");
		display(start + 1,end);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start and end number : ");
		display(sc.nextInt(),sc.nextInt());
		sc.close();
	}
}
