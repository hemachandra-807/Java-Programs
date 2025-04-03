import java.util.*;

public class StringPalindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome or not");
		String s = sc.nextLine();
		String reverse="";
		String original = s;
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
		if(reverse.equals(original))
		{
			System.out.println("String Palindrome");
		}
		else
		{
			System.out.println("Not a String Palindrome");
		}	
		sc.close();
	}
}
