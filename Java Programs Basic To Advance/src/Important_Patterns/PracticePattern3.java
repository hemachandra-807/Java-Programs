package Important_Patterns;

import java.util.Scanner;

public class PracticePattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		int spaces=rows,star=1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < spaces; j++) {

				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			spaces--;
			star+=2;
		}
	}
}
