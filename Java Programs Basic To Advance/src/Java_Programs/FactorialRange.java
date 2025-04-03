package Java_Programs;

import java.util.Scanner;

public class FactorialRange {

	public static int isFact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			System.out.println(isFact(i));
		}
		sc.close();
	}

}
