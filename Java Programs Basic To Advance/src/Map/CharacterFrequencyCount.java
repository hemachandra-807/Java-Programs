package Map;

import java.util.HashMap;

public class CharacterFrequencyCount {
	
	public static void charFreqCount(String str)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i=0 ;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		
		String str = "banana";
		
		charFreqCount(str);
	}
}
