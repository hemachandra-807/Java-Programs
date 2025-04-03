package com.wipro.programs;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int minValue = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            if (num < minValue) {
                minValue = num;
            }
        }
        
        System.out.println(minValue);
    }
}
