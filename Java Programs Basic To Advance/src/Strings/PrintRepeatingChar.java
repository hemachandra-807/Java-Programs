package Strings;

public class PrintRepeatingChar {

	public static void main(String[] args) {
		
		String str = "abbahssm";
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(ch == str.charAt(j))
				{
					System.out.print(ch+" ");
					break;
				}
			}
		}
	}
}
