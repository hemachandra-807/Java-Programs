package Recursion_Problems;

public class ArmStrongNum {

	public static int isArmStrong(int num, int digits) {

		if (num == 0)
			return 0;

		return (int) Math.pow(num % 10, digits) + isArmStrong(num / 10, digits);
	}

	public static void main(String[] args) {
		int num = 370;
		int original = num;
		int digits = String.valueOf(num).length();
		if (original == isArmStrong(num, digits)) {
			System.out.println("ArmStrong number");
		} else {
			System.out.println("Not a ArmStrong number");
		}
	}
}
