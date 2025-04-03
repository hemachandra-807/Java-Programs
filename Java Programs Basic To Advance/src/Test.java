import java.util.HashSet;

public class Test {

	public static int StringChallenge(String str)
	{
		int maxUniqueCount = 0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
                if (str.charAt(i) == str.charAt(j)) {
                    HashSet<Character> uniqueChars = new HashSet<>();
                    for (int k = i + 1; k < j; k++) {
                        uniqueChars.add(str.charAt(k));
                    }
                    maxUniqueCount = Math.max(maxUniqueCount, uniqueChars.size());
                }
			}
		}
		return maxUniqueCount;
	}
	public static void main(String[] args) {
		
		System.out.println(StringChallenge("abccdefghi"));
	}
}