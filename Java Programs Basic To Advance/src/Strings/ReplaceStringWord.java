
public class ReplaceStringWord {

	public static void main(String[] args) {
	
		String str = "Hello hi welcome bye dabba fellows";
		String[] arr = str.split(" ");
		String current = "dabba";
		String replace = "awesome";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(current))
			{
				System.out.print(replace+" ");
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
