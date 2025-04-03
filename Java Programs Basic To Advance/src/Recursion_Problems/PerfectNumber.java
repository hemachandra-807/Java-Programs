package Recursion_Problems;

public class PerfectNumber {

	public static int isperfect(int num, int i) {
		if (i == 0)
			return 0;

		if (num % i == 0) {
			return i + isperfect(num, i - 1);
		}
		return isperfect(num, i - 1);
	}

	public static void main(String[] args) {
		int num = 21;
		System.out.println(isperfect(num, num / 2));
	}
}
