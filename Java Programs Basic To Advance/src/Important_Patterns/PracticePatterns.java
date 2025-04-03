package Important_Patterns;

import java.util.Scanner;

public class PracticePatterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int spaces = num / 2;
		int star = 1;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				if (j == 1 || j == star) {
					System.out.print("*");
				} 
				else
					System.out.print(" ");
			}
			
			if (i <= num / 2) {
				spaces--;
				star += 2;
			} else {
				spaces++;
				star -= 2;
			}
			System.out.println();
		}
			
	}
	}