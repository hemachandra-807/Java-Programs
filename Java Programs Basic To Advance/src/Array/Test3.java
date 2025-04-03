
public class Test3 {

	public static void main(String[] args) {
		
		int x[] = {8,5,14,2,10,16,4};
		System.out.println("before sorted the array");
		for(int original : x)
		{
			System.out.print(original+" ");
		}
		System.out.println();
		
		for(int i=0;i<x.length-1;i++)
		{
			for(int j=0;j<x.length-1-i;j++)
			{
				if(x[j] > x[j+1])
				{
					x[j] = x[j] * x[j+1];
					x[j+1] = x[j] / x[j+1];
					x[j] = x[j] / x[j+1];
				}
			}
		}
		System.out.println("sorted in ascending");
		for(int sorted : x)
		{
			System.out.print(sorted+" ");
		}
	}
}
