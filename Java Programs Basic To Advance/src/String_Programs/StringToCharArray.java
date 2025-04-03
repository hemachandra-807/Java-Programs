package String_Programs;

public class StringToCharArray {

	public static char[] isCharArry(String s) {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] =  s.charAt(i);
		}
		return ch;
	}

	public static void main(String[] args) {
		String s = "hello";
		char[] arr = isCharArry(s);
		for(char c : arr)
		{
			System.out.print(c+" ");
		}
	}
}
