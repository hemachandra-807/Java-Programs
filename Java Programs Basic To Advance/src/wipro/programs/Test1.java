package com.wipro.programs;

import java.io.*;
import java.util.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        
        int[] A = readArray(br, N);
        int[] B = readArray(br, N - 1);
        int[] C = readArray(br, N - 2);
        
        HashSet<Integer> setB = new HashSet<>();
        HashSet<Integer> setC = new HashSet<>();
        
        for (int num : B) setB.add(num);
        for (int num : C) setC.add(num);
        
        int X = -1, Y = -1;
        
        for (int num : A) {
            if (!setB.contains(num)) {
                X = num;
                break;
            }
        }
        
        for (int num : B) {
            if (!setC.contains(num)) {
                Y = num;
                break;
            }
        }
        
        System.out.println(X);
        System.out.println(Y);
    }

    private static int[] readArray(BufferedReader br, int size) throws IOException {
        String[] tokens = br.readLine().trim().split("\\s+");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        return arr;
    }
}
