package Strings;

import java.util.Arrays;

public class ReverseEachWord {

	public static String isSplit(String str)
	{
		String[] s = str.split(" ");
		String result = "";
		for(int i=0;i<s.length;i++)
		{
			result = result + isReverse(" "+s[i]);
			
		}
		return result;
	}
	
	public static String isReverse(String str)
	{
		int i=0,j=str.length()-1;
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		while(i<j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		System.out.println(isSplit("Java is fun"));
	}
}
