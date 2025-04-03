package Java_Programs;

import java.util.Scanner;

public class binaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, i = 1;

		while (num > 0) {
			sum = sum + (num % 10) * i;
			i = i * 2;
			num = num / 10;
		}
		System.out.println(sum);
		sc.close();
	}
}
