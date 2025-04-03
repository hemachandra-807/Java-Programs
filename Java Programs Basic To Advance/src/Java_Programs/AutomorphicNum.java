package Java_Programs;

import java.util.Scanner;

public class AutomorphicNum {

	public static boolean isAutomorphic(int num) {
		int square = num * num;
		boolean flag =true;
		while (num > 0) {
			if (num % 10 != square % 10) {
				flag=false;
			}
			num=num/10;
			square=square/10;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if(isAutomorphic(num))
		{
			System.out.println("is Automorphic number");
		}else {
			System.out.println("is Not a Automorphic number");
		}
		sc.close();
	}
}
