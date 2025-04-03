import java.util.*;
public class RemoveDuplicatesChar {

	public static void main(String[] args) {
		char[] ch = {'a','g','h','k','e','u','k','h','a'};
		
		HashSet<Character> hs = new HashSet<Character>();
		for(Character chars : ch)
		{
			hs.add(chars);
		}
		System.out.println(hs);
	}
}
