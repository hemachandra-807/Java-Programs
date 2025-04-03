package com.jsp.conversions;

public class OctalToInteger {

	public static void main(String[] args) {
		String octal = "231";
		int decimal = 0;
		for (int i = 0; i < octal.length(); i++) {
			int digit = octal.charAt(i) - '0';
			decimal = decimal * 8 + digit;
		}
		System.out.println(decimal);
	}
}
