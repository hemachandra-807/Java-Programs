package com.patterns.porgrams;

public class PascalsPattern {

	public static void main(String[] args) {
		int lines = 5;
		
		for(int i=0;i<lines;i++)
		{
			int num =1;
			for(int j=0;j<lines-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num = num * (i - j)/ (j + 1);
			}
			System.out.println();
		}
	}
}
