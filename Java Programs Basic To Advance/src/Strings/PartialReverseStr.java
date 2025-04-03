
public class PartialReverseStr {

	public static void main(String[] args) {
		String str = "Jspiders";
		
		String halfStr= str.substring(0, str.length()/2);
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		String partialrev = rev.substring(0, rev.length()/2);
		
		String result = halfStr + partialrev;
		System.out.println(result);
	}
}

