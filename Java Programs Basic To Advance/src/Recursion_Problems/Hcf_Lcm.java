package Recursion_Problems;

import java.util.Scanner;

public class Hcf_Lcm {

	public static int isHcf(int a, int b) {
		if (b == 0)
			return a;
		return isHcf(b, a % b);
	}

	public static int isLcm(int a, int b) {
		return (a * b) / isHcf(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Hcf: " + isHcf(a, b));
		System.out.println("Lcm: " + isLcm(a, b));
		sc.close();
	}
}
