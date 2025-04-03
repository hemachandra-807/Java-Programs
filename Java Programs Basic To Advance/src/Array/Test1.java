import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[sc.nextInt()];
		int ele=0;
		for(int i=0;i<arr.length;i++)
		{
			ele +=10;
			arr[i]=ele;
			System.out.println(arr[i]);
		}
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		sc.close();
	}
}
