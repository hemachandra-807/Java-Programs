package Java_Programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int original = num, rev = 0, rem = 0;
		
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(original==rev?"Palindrome number":"Not a Palindrome number");
		sc.close();
	}
}
