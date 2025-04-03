package Array;

public class FindMissingElement {

	public static int missingElement(int[] arr)
	{
		int n = arr.length, arrSum = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			arrSum = arrSum + arr[i];
		}
		
		return n * (n + 1) / 2 - arrSum;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,7,8,9};
		
		System.out.println(missingElement(arr));
	}
}
