
public class SplitTheFuncWithoutSplit {

	public static void main(String[] args) {
		String str = "hello hi bye";
		int space=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				space++;
			}
		}
		String[] arr = new String[space+1];
		String temp="";int k=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				arr[k]=temp;
				k++;
				temp="";
			}
			else
			{
				temp = temp + str.charAt(i);
			}
		}
		arr[k]=temp;
		for(String ele : arr)
		{
			System.out.println(ele);
		}
	}
}
