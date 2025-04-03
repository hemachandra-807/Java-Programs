package Java_Programs;

public class NeonNumber {

	public static void main(String[] args) {
		int num=1;
		
		int sum=0,rem=0;
		int sq=num*num;
		while(sq>0)
		{
			rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		System.out.println(sum==num?"Neon Number":"Not a Noen Number");
	}
}
