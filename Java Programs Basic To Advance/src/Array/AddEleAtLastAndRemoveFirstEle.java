package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AddEleAtLastAndRemoveFirstEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int lenArr = sc.nextInt();
		int[] list = new int[lenArr];
		System.out.println("Enter array data: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		System.out.println("Enter a number to be inserted: ");
		int insert = sc.nextInt();
		System.out.println(Arrays.toString(isList(list, insert)));
		sc.close();
	}

	public static int[] isList(int[] arr, int insert) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < newArr.length - 1; i++) {
			newArr[i] = arr[i + 1];
		}
		newArr[newArr.length - 1] = insert;
		return newArr;
	}
}
