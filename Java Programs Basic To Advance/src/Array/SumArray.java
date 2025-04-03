
public class SumArray {

	public static void main(String[] args) {
		
		int x[] = {12,8,4,2,10,6,16};
		
		int sum = 0;
		for(int i=1;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		System.out.println(sum);
	}
}
