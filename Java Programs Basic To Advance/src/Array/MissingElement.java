
public class MissingElement {

	static int missingNumber(int arr[],int num)
	{
		for(int i=1,j=0;i<=num;i++,j++)
		{
			boolean f=false;
			if(i==arr[j])
			{
				f=true;
				break;
			}
			if(f==false)
			{
				return i;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int []arr = {6,1,2,8,3,4,7,10,5};
		int num=9;
		System.out.println(missingNumber(arr,num));
	}
}
