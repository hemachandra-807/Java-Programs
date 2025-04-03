package Java_Programs;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to chect perfect number or not: ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= num/2; i++) { // "i<=num/2" is used to minimize the loop
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println((sum == num ? true : false));
		sc.close();
	}
}
