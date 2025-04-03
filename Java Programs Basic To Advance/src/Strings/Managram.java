import java.util.HashSet;
public class Managram {

	public static void main(String[] args) {
		String str = "abcd$efghi71jklm%&nopqr90stuvw&*xyz";
		HashSet<Character> hs = new HashSet<Character>();
		
		for(char ch : str.toCharArray())
		{
			char chars = ch;
			hs.add(chars);
		}
		int count=0;
		for(char res : hs)
		{
			if(res>='a'&&res<='z'||(res>='A'&&res<='Z'))
			{
				count++;
			}
		}
		if(count==26)
		{
			System.out.println("Managram");
		}
		else
		{
			System.out.println("Not a Managram");
		}
	}
}
