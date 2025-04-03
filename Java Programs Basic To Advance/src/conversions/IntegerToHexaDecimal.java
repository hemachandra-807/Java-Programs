package com.jsp.conversions;

public class IntegerToHexaDecimal {

	public static void main(String[] args) {
		int decimal = 960;
		char[] hexaChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String hexa = "";
		while (decimal > 0) {
			int rem = decimal % 16;
			hexa = hexaChar[rem] + hexa;
			decimal = decimal / 16;
		}
		System.out.println(hexa);
	}
}
