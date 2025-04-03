package com.techmahindra.programs;

public class SevenAsInputElevenAsOutput {

	/* Do not use if else statement
	 */
	public static int isFun(int num) {

//		return ((num == 7) ? num + 4 : (num == 11) ? num - 4 : 0);
		return 7 + 11 - num;
	}

	public static void main(String[] args) {
		System.out.println("Input is 7 :: " + isFun(7));
		System.out.println("Input is 11 :: " + isFun(11));
	}
}
