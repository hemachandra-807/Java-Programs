
public class StringAddition {

	static int StringToNum(String s)
	{
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			num = (num * 10) + (s.charAt(i)-48);
		}
		return num;
	}
	public static void main(String[] args) {
		String s1 ="142";
		String s2 = "162";
		System.out.println(StringToNum(s1)+StringToNum(s2));
	}
}
