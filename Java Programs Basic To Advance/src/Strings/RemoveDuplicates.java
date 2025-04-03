import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] str = {"Hema","kutty","Hema","kutty"};

		HashSet<String> hs = new HashSet<String>();
		for(String dup:str)
		{
			hs.add(dup);
		}
		System.out.println(hs);
	}
}
