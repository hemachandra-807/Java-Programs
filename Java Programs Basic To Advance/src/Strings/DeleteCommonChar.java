import java.util.HashSet;
public class DeleteCommonChar {

	public static String deleteCommonChar(String input1, String input2)
	{
		HashSet<Character> cmChar = new HashSet<Character>();
		for(char ch : input1.toCharArray())
		{
			if(input2.indexOf(ch) != -1)
			{
				cmChar.add(ch);
			}
		}
		StringBuilder output1 = new StringBuilder();
		StringBuilder output2 = new StringBuilder();
		
		for(char ch : input1.toCharArray())
		{
			if(!cmChar.contains(ch))
			{
				output1.append(ch);
			}
		}
		for(char ch : input2.toCharArray())
		{
			if(!cmChar.contains(ch))
			{
				output2.append(ch);
			}
		}
		String str = output1.toString() + output2.toString();
		return str;
	}
	public static void main(String[] args) {
		String input1 = "hemachandra";
		String input2 = "chandra";
		
		String result = deleteCommonChar(input1, input2);
		System.out.println(result);
	}
}
