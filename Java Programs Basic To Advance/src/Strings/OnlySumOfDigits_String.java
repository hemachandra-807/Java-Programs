
public class OnlySumOfDigits_String {
	public static void main(String[] args) {
		String s= "hello 123 bye55";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='0' && c<='9')
			{
				sum = sum + (c-48);
			}
		}
		System.out.println(sum);
	}
}
