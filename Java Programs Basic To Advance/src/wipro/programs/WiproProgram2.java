package com.wipro.programs;
import java.util.*;

public class WiproProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int ways = (N - 1) / 2;

        System.out.println(ways);
    }
}
