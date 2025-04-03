package Java_Programs;

import java.util.Scanner;

public class HappyNumber {

	public static int isHappy(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem);
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int result = num;
		while (result != 1 && result != 4) {
			result=isHappy(result);
		}
		if(result==1)System.out.println("Happy Number");
		else System.out.println("Not a Happy Number");
		sc.close();
	}
}
