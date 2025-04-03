package Comparable;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Student[] s = { new Student("hema", 23), new Student("chandra", 24), new Student("muh", 19) };

		Arrays.sort(s);
		for (Student obj : s) {
			System.out.println(obj);
		}

	}

}
