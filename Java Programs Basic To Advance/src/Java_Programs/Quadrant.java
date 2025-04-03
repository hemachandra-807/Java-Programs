package Java_Programs;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the value for variable x and y: ");
		int x = sc.nextInt(), y = sc.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("Quadrant I");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrant II");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrant III");
		} else if (x > 0 && y < 0) {
			System.out.println("Quadrant IV");
		} else if (x == 0 & y == 0) {
			System.out.println("Origin");
		} else if (y == 0 & x != 0) {
			System.out.println("X-Axis");
		} else if (x == 0 & y != 0) {
			System.out.println("Y-Axis");
		}
		sc.close();
	}
}