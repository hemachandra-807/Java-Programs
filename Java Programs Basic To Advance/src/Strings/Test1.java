
public class Test1 {

	public static void main(String[] args) {
		String s1 = "edcab";
		
		char charArray[] = s1.toCharArray();
		int s = charArray.length;
		for(int i=0;i<s;i++)
		{
			for(int j=i;j<s;j++)
			{
				
				if(charArray[i]>charArray[j])
				{
					charArray[i] = (char) (charArray[i]+charArray[j]);
					charArray[j] = (char) (charArray[i]-charArray[j]);
					charArray[i] = (char) (charArray[i]-charArray[j]);
				}
			}
		}
		System.out.println(charArray);
	}
}
