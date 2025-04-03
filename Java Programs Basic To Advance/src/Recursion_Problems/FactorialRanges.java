package Recursion_Problems;

public class FactorialRanges {

	public static int isFact(int num) {
		if (num == 1 || num == 0)
			return 1;
		return num * isFact(num - 1);
	}

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++)
		{
			System.out.print(isFact(i)+" ");
		}
	}
}
