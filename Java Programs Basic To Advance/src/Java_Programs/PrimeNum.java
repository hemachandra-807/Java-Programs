package Java_Programs;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check prime or not: ");
		int num = sc.nextInt();
		
		if(num<=1)
		{
			System.out.println("not a prime number");
		}else
		{
			boolean flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag=false;
					break;
				}
			}
			System.out.println((flag ? "prime number" : "not a prime number"));
		}
		sc.close();
	}
}
