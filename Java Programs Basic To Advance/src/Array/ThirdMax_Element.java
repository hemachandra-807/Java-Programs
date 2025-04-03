
public class ThirdMax_Element {

	public static void main(String[] args) {
		int arr[] = {12,56,89,34,29};
		
		int max = arr[0];int secondMax=0,thirdMax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max=arr[i];
			}
			else if(arr[i]>secondMax)
			{
				thirdMax=secondMax;
				secondMax = arr[i];
			}
			else if(arr[i]>thirdMax)
			{
				thirdMax=arr[i];
			}
		}
		System.out.println(thirdMax);
	}
}
