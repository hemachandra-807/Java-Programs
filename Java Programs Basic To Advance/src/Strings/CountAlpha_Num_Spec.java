import java.util.*;

public class CountAlpha_Num_Spec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char ch;int countAlpha = 0,countNum=0,countSpec=0;
		for(int i=0;i<s.length();i++)
		{
			ch = s.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				countAlpha++;
			}
			else if(ch>='0' && ch<='9')
			{
				countNum++;
			}
			else
			{
				countSpec++;
			}
		}
		System.out.println("Number of Alphas are present in String is "+countAlpha);
		System.out.println("Number of Numbers are present in String is "+countNum);
		System.out.println("Number of Special characters are present in String is "+countSpec);

		sc.close();
	}
}
