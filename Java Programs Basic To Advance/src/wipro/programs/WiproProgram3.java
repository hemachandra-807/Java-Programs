package com.wipro.programs;

import java.util.*;

class WiproProgram3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		System.out.println(a + (n - 1) * d);
	}
}
