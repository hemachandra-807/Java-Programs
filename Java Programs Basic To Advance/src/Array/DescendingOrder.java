
public class DescendingOrder {

	public static void main(String[] args) {
		
		int x[] = {12,8,4,2,10,6,16};
		System.out.println("before sorted the array");
		for(int original : x)
		{
			System.out.print(original+" ");
		}
		System.out.println();
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i] < x[j])
				{
					x[i] = x[i] + x[j];
					x[j] = x[i] - x[j];
					x[i] = x[i] - x[j];
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
