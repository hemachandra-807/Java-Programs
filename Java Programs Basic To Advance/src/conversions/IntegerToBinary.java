package com.jsp.conversions;

public class IntegerToBinary {

	public static void main(String[] args) {
		int decimal = 8;
		String binary = "";
		while (decimal != 0) {
			int rem = decimal % 2;
			binary = rem + binary;
			decimal = decimal / 2;
		}
		System.out.println(binary);
	}
}
