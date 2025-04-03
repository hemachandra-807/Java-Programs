
public class ArrayProduct {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		
		int product=1;
		for(int i=0;i<x.length;i++)
		{
			product = product * x[i];
		}
		System.out.println(product);
	}
}
