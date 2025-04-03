package String_Programs;

public class BalancedString {

	public static boolean isBalanacedString(String arg)
	{
		String s = "";
		for(int i=0;i<arg.length();i++)
		{
			char ch = arg.charAt(i);
			
			if(ch=='['||ch==']'||ch=='{'||ch=='}'||ch=='('||ch==')')
			{
				s += ch;
			}
		}
		
		while(s.contains("[]")||s.contains("{}")||s.contains("()"))
		{
			s = s.replace("[]", "").replace("{}", "").replace("()", "");
			System.out.println(s);
		}
		return s.length()==0;
	}
	public static void main(String[] args) {
		System.out.println(isBalanacedString("[5+4{4*(2+3)}]"));
	}
}
