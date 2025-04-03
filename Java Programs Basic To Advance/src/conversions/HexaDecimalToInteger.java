package com.jsp.conversions;

public class HexaDecimalToInteger {

	public static void main(String[] args) {
		String hexa = "0";
		hexa = hexa.toUpperCase();
		char[] hexaChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		long decimal = 0;

		for (int i = 0; i < hexa.length(); i++) {
			int digit = hexa.charAt(i) - '0';
			if (hexa.charAt(i) >= 'A') {
				for (int j = 0; j < hexaChar.length; j++) {
					if (hexa.charAt(i) == hexaChar[j]) {
						digit = j;
					}
				}
			}
			decimal = decimal * 16 + digit;
		}
		System.out.println(decimal);
	}
}
