package Java_Programs;

public class PrimeLogicForNegativeNum {

	public static void main(String[] args) {
		int start = -7;
		int end = -100;
		
		int number = start;
		int num = Math.abs(number);
	}
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}else
		{
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num % i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
