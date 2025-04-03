
public class AllPossibleSubstr {

	public static void main(String[] args) {
		
		String str = "banana";
		
		for(int i=0;i<str.length();i++)
		{
			String temp=""+str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				temp = temp +str.charAt(j);
				System.out.println(temp);
			}
		}
	}
}