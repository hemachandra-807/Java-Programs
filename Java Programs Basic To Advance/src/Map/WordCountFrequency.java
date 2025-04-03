package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordCountFrequency {

	public static void wordCountFreq(String str)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] strArray = str.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			String word = strArray[i];
			
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		Set<Map.Entry<String, Integer>> s = map.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = s.iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> next = itr.next();
			System.out.println(next.getKey()+" "+next.getValue());
		}
	}
	public static void main(String[] args) {
		String str = "hello world program java program java developer hello";
		wordCountFreq(str);
	}
}
