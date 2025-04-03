
public class SecondMinArray {
	public static void main(String[] args) {
		
		int x[] = {21,45,78,23,54,67,99};
		
		int min=x[0],secondMin=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<min)
			{
				secondMin = min;
				min = x[i];
			}
			else if(x[i]<secondMin)
			{
				secondMin = x[i];
			}
		}
		System.out.println(secondMin);
	}

}
