package com.fingerstrips.programs;

public class Pattern {

	public static void main(String[] args) {
		int num = 7;
		int space = num / 2;
		for (int i = 1; i <= num; i++) {

			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=space+1;j<=space+2;j++)
			{
				System.out.print(j+" ");
			}
			if(1+num/2>i)
			{
				space--;
			}else
			{
				space++;
			}
			System.out.println();
		}
	}
}
