package Map;

import java.util.Arrays;
import java.util.HashMap;

public class AllMissingNumberArray {

	public static void findMissingNum(int[] array)
	{
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for (int num : array) {
            map.put(num, true);
        }
		
		Arrays.sort(array);
		int heighest = array[array.length-1];
		for(int i=1;i<=heighest;i++)
		{
			if(map.containsKey(i))
				continue;
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int[] arr = {3, 8, 4, 5};
		findMissingNum(arr);
	}
}
