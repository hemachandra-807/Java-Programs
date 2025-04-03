package String_Programs;

public class ReverSentence {
	public static void main(String[] args) {
		String s="Java is very easy";
		String reverse="";
		
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			reverse +=str[i];
			reverse +=" ";
		}
		System.out.println(reverse);
	}
}
