
public class AscendingOrder {

	public static void main(String[] args) {

		int x[] = { 8, 4, 2, 10, 6 };

		for (int i = 0; i < x.length; i++) {
			for (int j = i; j < x.length; j++) {
				if (x[i] > x[j]) {
					x[i] = x[i] + x[j];
					x[j] = x[i] - x[j];
					x[i] = x[i] - x[j];
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}

