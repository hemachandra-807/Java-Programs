package com.ibm.programs;

import java.io.*;
import java.util.*;

class Result {

    public static int getMaxTrafficTime(List<Integer> start, List<Integer> end) {
        List<int[]> events = new ArrayList<>();
        
        for (int s : start) {
            events.add(new int[]{s, 1}); 
        }
        for (int e : end) {
            events.add(new int[]{e + 1, -1}); 
        }
        
        events.sort((a, b) -> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        
        int maxTraffic = 0;
        int currentTraffic = 0;
        int earliestTime = -1;
        
        for (int[] event : events) {
            currentTraffic += event[1];
            if (currentTraffic > maxTraffic) {
                maxTraffic = currentTraffic;
                earliestTime = event[0];
            }
        }
        
        return earliestTime;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> start = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            start.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }
        int m = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> end = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            end.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        int result = Result.getMaxTrafficTime(start, end);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
