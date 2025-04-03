import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {10,20,20,30,40,50,10};

		HashSet<Integer> hs = new HashSet<Integer>();
		for(Integer dup:arr)
		{
			hs.add(dup);
		}
		System.out.println(hs);
	}
}
