package String_Programs;

public class CountNonSeqeunceFrequency {

	public static String isFrequency(String s)
	{
		int[] freq = new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			freq[s.charAt(i)]++;
		}
		
		String result = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(freq[s.charAt(i)]>0)
			{
				result = result + s.charAt(i) + freq[s.charAt(i)]+" ";
				
				freq[s.charAt(i)] = 0;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		String s = "aaabbcc";
		
		System.out.println(isFrequency(s));
	}
}
