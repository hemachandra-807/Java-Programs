import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Linear Search");
		int key=sc.nextInt();
		int position = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				position = i;
				break;
			}
		}
		System.out.println(position);
		sc.close();
	}
}
