package com.patterns.porgrams;

public class FloydsPattern {

	public static void main(String[] args) {
		int lines =5,num=1;
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
