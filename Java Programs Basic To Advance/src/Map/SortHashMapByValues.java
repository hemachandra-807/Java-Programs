package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValues {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Hema", 50);
		map.put("David", 30);
		map.put("Chandra", 10);
		map.put("Vijay", 20);
		map.put("Prakash", 40);
		
		List<Entry<String, Integer>> entry = new ArrayList<>(map.entrySet());
		
		Collections.sort(entry, new Comparator<Map.Entry<String, Integer>>() {
		
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2)
			{
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		System.out.println("Using HashMap But Insertion Order Not Maintained: ");
		System.err.println(entry);// but which is not maintaining Insertion order so use LinkedHashMap
		
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> sort : entry)
		{
			sortedMap.put(sort.getKey(), sort.getValue());
		}
		System.out.println("Using LinkedHashMap to Maintain Insertion Order: ");
		System.out.println(sortedMap);
	}
}
