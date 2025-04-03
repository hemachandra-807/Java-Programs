package Java_Programs;

import java.util.Scanner;

public class StrongNum {

	public static int isFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check Strong number or not: ");
		int num=sc.nextInt();
		int sum=0,rem=0,original=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+isFact(rem);
			num=num/10;
		}
		System.out.println(sum==original?"Strong number":"Not a Strong number");
		sc.close();
	}
}
