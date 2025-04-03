package Map;

import java.util.Arrays;
import java.util.HashMap;

public class OnlyOneMissingNumArray {

	public static void findMissingNum(int[] array)
	{
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for (int num : array) {
            map.put(num, true);
        }
		int N = 0;
        for (int num : array) {
            if (num > N) {
                N = num;
            }
        }
		
		for(int i=1;i<=N;i++)
		{
			if(map.containsKey(i))
				continue;
			
			System.out.println(i);
			return;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6, 7, 8};
		findMissingNum(arr);
	}
}
