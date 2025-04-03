package Strings;

public class TwoStringsRotationEachOther {

	public static void main(String[] args) {

		String str = "abcd";

		if (isStringRotation(str, "bcda")) {
			System.out.println("Rotated");
		}
	}

	public static boolean isStringRotation(String str, String rotatedStr) {
		if (str == null || rotatedStr == null) {
			return false;
		} else if (str.length() != rotatedStr.length()) {
			return false;
		} else {
			String concate = str + str;
			return concate.contains(rotatedStr);
		}
	}
	/*
	 * This method is used to generate rotation of a String if input is "abcd" =>
	 * output is "bcda", "cdab", "dabc"...
	 */
//	public static String isManualRotation(String str) {
//		String temp = str;
//		String substr = "";
//		int i = 0;
//		while (i < str.length() - 1) {
//			substr += str.charAt(i);
//			temp = temp.substring(1);
//			String sub1 = temp + substr;
//			i++;
//			return sub1;
//		}
//		return null;
//	}
}
