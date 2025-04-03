
public class StringAnagramWithoutFunction {

	static String isAnagram(char[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "leolh";
		
		char[] arr1 = new char[s1.length()];
		char[] arr2 = new char[s2.length()];
		
		String ans1 = isAnagram(arr1);
		String ans2 = isAnagram(arr2);
		
		if(ans1.equals(ans2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not a Anagram");
		}
	}
}
