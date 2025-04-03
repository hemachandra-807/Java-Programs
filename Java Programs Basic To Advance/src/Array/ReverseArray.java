public class ReverseArray {

	public static void main(String[] args) {
		
		int x[] = {12,8,4,2,10,6,16};
 
	    int result[] = isReverse(x);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
	}
	
	static int[] isReverse(int x[])
	{
		int len = x.length;
		for(int i=0;i<len/2;i++)
		{
			int temp = x[i];
			x[i] = x[len-1-i];
			x[len-1-i] = temp;
		}
        return x;
	}
}
