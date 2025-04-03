package com.patterns.porgrams;

public class TrickyNumberRightHalfTriangleStar {
	
	/* input = 6
	 * 1
	 * 7  2 
	 * 12 8  3 
	 * 16 13 9  4
	 * 19 17 14 10 5
	 * 21 20 18 15 11 6
	 */

	public static void main(String[] args) {
		int size = 6;
		
		int num = 1;
		
		for(int i=1;i<=size;i++)
		{
			int current = num;
			for(int j=1;j<=i;j++)
			{
				System.out.print(current+" ");
				current -= (size - i + j);
			}
			num += (size - i + 1);
			System.out.println();
		}
	}
}
