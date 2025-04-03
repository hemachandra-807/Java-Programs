package com.jsp.conversions;

public class IntegerToOctal {

	public static void main(String[] args) {
		int decimal = 153;
		String octal = "";
		while (decimal > 0) {
			int rem = decimal % 8;
			octal = rem + octal;
			decimal = decimal / 8;
		}
		System.out.println(Integer.parseInt(octal));
	}
}
