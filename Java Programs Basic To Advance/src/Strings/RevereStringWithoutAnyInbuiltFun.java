package Strings;

public class RevereStringWithoutAnyInbuiltFun {

	public static int isLen(String s)
	{
		int len = 0;
		 while (true) {
	            try {
	                byte c = s.getBytes()[len];
	                len++; 
	            } catch (Exception e) {
	            	return len;
	            }
	        }
	}
	public static char getChar(String s, int index)
	{
		int position = 0;
		char extractedchar = '\u0000';

		while(true)
		{
			try {
				char temp = (char)  s.getBytes()[position];
				if(position == index)
				{
					extractedchar = temp;
					break;
				}
				position++;
			}catch(Exception e)
			{
				
				break;
			}
		}
		return extractedchar;
	}
	public static char[] convertArray(String s)
	{
		int length = isLen(s);
		char[] carr = new char[length];
		
		int index = 0;
		for(int i=0;i<length;i++)
		{
			carr[index] = getChar(s, i);
			index++;
		}
		return carr;
	}
	public static String isReverse(String s)
	{
		int i = 0, j = isLen(s)-1;
		char[] c = convertArray(s);
		while(i<j)
		{
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		return new String(c);
	}
	public static void main(String[] args) {
		
		String s = "hemachandra";
		
		System.out.println(isReverse(s));
	}
}
