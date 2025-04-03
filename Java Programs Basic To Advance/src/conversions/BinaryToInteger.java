package com.jsp.conversions;

public class BinaryToInteger {

	public static void main(String[] args) {
		String binary = "0010";
		int decimal = 0;

		for (int i = 0; i < binary.length(); i++) {
			int digit = binary.charAt(i) - '0';
			decimal = decimal * 2 + digit;
		}
		System.out.println(decimal);
	}
}
