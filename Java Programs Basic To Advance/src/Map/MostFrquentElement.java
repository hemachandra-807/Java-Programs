package Map;

import java.util.HashMap;
import java.util.Map;

public class MostFrquentElement {

	public static void mostFreqEle(Integer[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		Integer maxFreq = 0;
		Integer mostFreq = 1;
		
		for(Integer key : map.keySet())
		{
			if(map.get(key)>maxFreq)
			{
				maxFreq = map.get(key);
				mostFreq = key;
			}
		}
		System.out.println("Most Frequent Element: " + mostFreq);
	}

	public static void main(String[] args) {
		Integer[] array = { 1, 3, 2, 3, 4, 1, 1, 3, 3 };
		
		mostFreqEle(array);
	}
}
