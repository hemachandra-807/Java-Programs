package Java_Programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 1;
		int range = 21;
		
		while (n1 <= range) {
			System.out.print(n1 + " ");
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
