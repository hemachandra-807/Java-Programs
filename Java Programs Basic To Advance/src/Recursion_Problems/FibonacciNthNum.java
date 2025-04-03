package Recursion_Problems;

public class FibonacciNthNum {
	static int n1 = 0, n2 = 1, n3;

	public static int isFibonacciSeries(int num) {
		if (num > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			isFibonacciSeries(num - 1);
		}
		return n1;
	}

	public static void main(String[] args) {

		int maxFibo = -1;

		int f = isFibonacciSeries(10);
		if (f > maxFibo) {
			maxFibo = f;
		}
		if (maxFibo != -1) {
			System.out.println(maxFibo);
		}
	}
}
