package Java_Programs;

import java.util.Scanner;

public class FactorialStartEnd {

	public static int isFact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(isFact(i));
		}
		sc.close();
	}

}
