package com.patterns.porgrams;

public class LeftHalfDiamondStar {

	public static void main(String[] args) {
		int num = 7;
		int spaces = num/2;
		int stars = 1;
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=stars;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=spaces;j++)
			{
				System.out.print("  ");
			}
			System.out.println();
			if(i<=num/2)
			{
				spaces--;
				stars+=1;
			}else
			{
				spaces++;
				stars-=1;
			}
		}
	}
}
