package Array;

import java.util.Arrays;

public class MissingPositiveNum{
	
	public static int missingNumber(int[] array)
	{
		int missedNum = 0;
		Arrays.sort(array);
		int highest = array[array.length - 1];

		boolean[] present = new boolean[highest + 1];
		
		for(int num : array)
		{
			if(num<0)
			continue;
			present[num] = true;
		}
		
		for(int i=0;i<=highest;i++)
		{
			if(!present[i])
			{
				missedNum = i;
				break;
			}
		}
		return missedNum;

	}
	public static void main(String[] args) {
		int[] array = {-1,4,3,1};
		
		System.out.println(missingNumber(array));
	}
}
