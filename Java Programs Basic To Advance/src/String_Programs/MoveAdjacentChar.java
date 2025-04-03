package String_Programs;

public class MoveAdjacentChar {

	public static String moveAdjacent(String s)
	{
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length-1;i+=2)
		{
			char temp = ch[i];
			ch[i] = ch[i+1];
			ch[i+1] = temp;
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String s = "hemachandra";
		
		System.out.println(moveAdjacent(s));
	}
}
