package Recursion_Problems;

public class FactorialNthNum {

	public static int isFact(int num) {
		if (num == 1 || num == 0)
			return 1;
		return num * isFact(num - 1);
	}

	public static void main(String[] args) {
		int maxNthFact = -1;
		for (int i = 0; i <= 10; i++) {
			int m = isFact(i);
			if (m > maxNthFact) {
				maxNthFact = m;
			}
		}
		if (maxNthFact != -1) {
			System.out.println(maxNthFact);
		}
	}
}
