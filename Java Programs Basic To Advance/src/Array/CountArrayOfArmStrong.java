
public class CountArrayOfArmStrong {

	public static void main(String[] args) {
		int arr[] = {11,9,8,153,1634};
		
		int count=0;
		for(int result : arr)
		{
			if(isArmStrong(result))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	static int isCountDigits(int num) {
		int count = 0;
		do {
			num = num / 10;
			count++;
		} while (num > 0);
		return count;
	}

	static boolean isArmStrong(int num) {
		int sum = 0;
		int original = num;
		int rem = 0;
		int digits = isCountDigits(num);
		do {
			rem = num % 10;
			sum = sum + isPower(rem, digits);
			num = num / 10;
		} while (num > 0);
		return sum == original;
	}

	static int isPower(int base, int expo) {
		int pow = 1;
		for (int i = 1; i <= expo; i++) {
			pow = pow * base;
		}
		return pow;
	}
}
