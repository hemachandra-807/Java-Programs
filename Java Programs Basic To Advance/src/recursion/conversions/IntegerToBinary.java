package com.jsp.recursion.conversions;

public class IntegerToBinary {

	public static String isbinary(int decimal) {
		if (decimal == 0)
			return "";

		int rem = decimal % 2;
		return isbinary(decimal / 2) + rem;
	}

	public static void main(String[] args) {
		System.out.println(isbinary(8));
	}
}
