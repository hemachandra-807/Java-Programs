package Array;

public class TwoSum {

	public static String twoSum(int[] array, int target)
	{
		String indexes = "";
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i] + array[j] == target)
				{
					indexes = " "+i+" "+j;
				}
			}
		}
		return indexes;
	}
	public static void main(String[] args) {
		
		int[] array = {1, 2, 4, 7, 3, 8,};
		int target = 3;
		
		System.out.println(twoSum(array, target));
 	}
}
