package Array;

import java.util.Scanner;

public class CubicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int[] array = new int[sc.nextInt()];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.printf("Element array[%d] : ",i);
			array[i] = sc.nextInt();
		}
		
		System.out.println("\nCubic Array Values: sss");
		for (int i : array) {
			System.out.println(i * i * i);
		}
	}
}
