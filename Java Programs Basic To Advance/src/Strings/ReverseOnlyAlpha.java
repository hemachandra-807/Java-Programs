
public class ReverseOnlyAlpha {

	public static void main(String[] args) {
		String s1 = "AB$%H&JKL";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				rev = rev+s1.charAt(i);
			}
		}
		String ans="";int k=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				ans = ans+rev.charAt(k);
				k++;
			}
			else
			{
				ans = ans + s1.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
