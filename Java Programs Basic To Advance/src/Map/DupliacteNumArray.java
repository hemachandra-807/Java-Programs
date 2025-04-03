package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DupliacteNumArray {

	public static void isDuplicate(int[] array)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
		
		Set<Map.Entry<Integer, Integer>> duplicate = map.entrySet();
		
		Iterator<Map.Entry<Integer, Integer>> itr = duplicate.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, Integer> next = itr.next();
			
			if(next.getValue()>1)
			{
				System.out.println(next.getKey()+":"+next.getValue()+" times");
			}
		}
	}
	public static void main(String[] args) {
		int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
		isDuplicate(input);
	}
}
