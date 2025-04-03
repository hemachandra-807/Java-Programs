package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWithinStringWithoutInbuiltFun {

	/*
	 * Check if a String Contains Another String without using contains();\
	 * 
	 * if(A.contains(B)) { System.out.println("Yes"); }else {
	 * System.out.println("No"); }
	 * Do not use contains() method
	 * 
	 */
	public static void main(String[] args) {

		String A = "abcdefgh";
		String B = "ab";

		Pattern p = Pattern.compile(B);
		Matcher m = p.matcher(A);

		if (m.find()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
