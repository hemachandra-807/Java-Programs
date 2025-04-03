package Recursion_Problems;

public class PerfectNum {

	public static int isPerfect(int num, int i, int sum)
	{
		if(i==0)return sum;
		if(num%i==0)sum=sum+i;
		return isPerfect(num, i-1, sum);
	}
	public static void main(String[] args) {
		int num = 28,i=num/2,sum=0;
		int original=num;
		if(original==isPerfect(num, i, sum)) {
			System.out.println("Perfect");
		}else
		{
			System.out.println("Not a Perfect");
		}
	}
}
