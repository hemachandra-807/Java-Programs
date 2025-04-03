
public class StringReverseEvenIndex {

	static String isReverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String s = "hello hi welcome bye";
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(isReverse(arr[i]));
			}
			else
			{
				System.out.print(" "+arr[i]+" ");
			}
		}
	}
}
