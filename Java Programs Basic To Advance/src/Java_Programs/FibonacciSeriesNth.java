package Java_Programs;

public class FibonacciSeriesNth {

	public static int isNthFibo(int num)
	{
		if(num<=1) {
			return num;
		}
		return isNthFibo(num-1)+isNthFibo(num-2);
		
	}
	public static void main(String[] args) {
		int num =10;
		System.out.println(isNthFibo(num));
	}
}