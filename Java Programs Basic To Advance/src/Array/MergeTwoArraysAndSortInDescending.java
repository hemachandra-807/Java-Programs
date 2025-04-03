package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArraysAndSortInDescending {

	public static int[] descending(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					array[i] = array[i] + array[j] - (array[j] = array[i]);
				}
			}
		}
		return array;
	}
	public static int[] mergeTwoArrays(int[] array1, int[] array2)
	{
		int[] arr3 = new int[array1.length + array2.length];
		int count = 0;
		for(int i=0;i<array1.length;i++)
		{
			arr3[i] = array1[i];
			count++;
		}
		for(int i=0;i<array2.length;i++)
		{
			arr3[count] = array2[i];
			count++;
		}
		
		return descending(arr3);
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		System.out.println(Arrays.toString(mergeTwoArrays(arr1, arr2)));
	}
}
