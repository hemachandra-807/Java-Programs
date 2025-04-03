package Java_Programs;
import java.util.Scanner;

public class TrickyProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int m = num;

		for (int i = 10; m > 9; i *= 10) {
			
			System.out.println(num%i);
			m/=10;
		}
		sc.close();
	}
}
