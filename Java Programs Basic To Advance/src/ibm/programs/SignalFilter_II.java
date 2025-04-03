package com.ibm.programs;

import java.util.*;

public class SignalFilter_II {

    public static int countSignals(List<Integer> frequencies, List<List<Integer>> filterRanges) {
        int commonLow = Integer.MIN_VALUE;
        int commonHigh = Integer.MAX_VALUE;

        for (List<Integer> range : filterRanges) {
            commonLow = Math.max(commonLow, range.get(0));
            commonHigh = Math.min(commonHigh, range.get(1));
        }

        int count = 0;
        for (int freq : frequencies) {
            if (freq >= commonLow && freq <= commonHigh) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> frequencies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            frequencies.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        int rangeSize = scanner.nextInt(); 
        List<List<Integer>> filterRanges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> range = new ArrayList<>();
            for (int j = 0; j < rangeSize; j++) {
                range.add(scanner.nextInt());
            }
            filterRanges.add(range);
        }

        System.out.println(countSignals(frequencies, filterRanges));
        scanner.close();
    }
}

