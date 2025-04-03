
public class MaxArray {

	public static void main(String[] args) {
		
		int x[] = {12,8,4,2,10,6,16};
		
		int max = x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max = x[i];
			}		
		}
		System.out.println(max);
	}
}

