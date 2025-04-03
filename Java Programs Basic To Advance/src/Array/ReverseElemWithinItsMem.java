
public class ReverseElemWithinItsMem {
	
	static int[] isReverse(int[] arr)
	{
		int l=0,r=arr.length-1;
		while(l<r)
		{
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int res[] = isReverse(arr);
		for(int output : res)
		{
			System.out.print(output+" ");
		}
	}
}
