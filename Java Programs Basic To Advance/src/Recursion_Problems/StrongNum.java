package Recursion_Problems;

public class StrongNum {

	public static int isStrong(int num) {
		if (num == 0)
			return 0;
		return isFact(num % 10) + isStrong(num / 10);
	}

	public static int isFact(int num) {
		if (num == 1 || num == 0)
			return 1;
		return num * isFact(num - 1);
	}

	public static void main(String[] args) {

		int num = 145;
		int original = num;
		if (isStrong(num) == original) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a Strong number");
		}
	}
}
