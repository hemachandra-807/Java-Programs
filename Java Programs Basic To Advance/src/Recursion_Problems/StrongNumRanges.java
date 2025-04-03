package Recursion_Problems;

public class StrongNumRanges {

	public static int isStrong(int num) {
		if (num == 0)
			return 0;
		return isFact(num % 10) + isStrong(num / 10);
	}

	public static int isFact(int num) {
		if (num == 0)
			return 1;
		return num * isFact(num - 1);
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 100000; i++) {
			if (i == isStrong(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
