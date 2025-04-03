package Recursion_Problems;

public class ArmStrongNumRanges {

	public static int isArmStrong(int num) {
		if (num == 0)
			return 0;

		return (int) Math.pow(num % 10, 3) + isArmStrong(num / 10);
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {
			if (i == isArmStrong(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
