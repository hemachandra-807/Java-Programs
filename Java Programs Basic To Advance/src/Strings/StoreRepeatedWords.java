import java.util.*;

public class StoreRepeatedWords {

	public static void main(String[] args) {
		String str[] = { "cat", "batman", "cat", "book", "pen", "cat", "book" };

		HashSet<String> repeatedWords = new HashSet<String>();
		HashSet<String> uniqueWords = new HashSet<String>();
		for(String word : str)
		{
			if(!uniqueWords.add(word))
			{
				repeatedWords.add(word);
			}
		}
		for(String word : repeatedWords)
		{
			System.out.print(word+" ");
		}
	}
}
