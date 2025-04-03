package String_Programs;

public class PartialReverse {

	public static String isPartial(String s)
	{
		String firstHalf = s.substring(0, s.length() / 2);
		String lastHalf = s.substring(s.length() / 2);
		
		String halfReverse = new StringBuilder(lastHalf).reverse().toString();
		
		return firstHalf + halfReverse;
	}
	public static void main(String[] args) {
		String s = "Jspiders";
		
		System.out.println(isPartial(s));
	}
}
