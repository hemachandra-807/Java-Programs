package com.jsp.recursion.conversions;

public class BinaryToDecimal {

    public static int isBinary(String binary, int index, int result) {
        if (index == binary.length()) {
            return result;
        }

        result = result * 2 + (binary.charAt(index) - '0');

        return isBinary(binary, index + 1, result);
    }

    public static void main(String[] args) {
        String binary = "1000"; 
        int decimal = isBinary(binary, 0, 0);

        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}

