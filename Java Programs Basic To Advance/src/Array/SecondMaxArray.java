
public class SecondMaxArray {
	public static void main(String[] args) {

		int x[] = { 21, 45, 78, 23, 54, 67, 99, 99 };

		int max = x[0], secondMax = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				secondMax = max;
				max = x[i];
			} else if (x[i] > secondMax && secondMax == max) {
				secondMax = x[i];
			}
		}
		System.out.println(secondMax);
	}

}
