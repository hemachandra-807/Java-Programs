package com.amazon.programs;

import java.util.*;

class Result {
    public static long findMaxValue(List<Integer> factor, List<List<Integer>> data, int x) {
        List<Integer> candidates = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            List<Integer> row = data.get(i);
            int maxElements = factor.get(i);

            // Sort row in descending order and pick the top maxElements
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(row);

            for (int j = 0; j < maxElements && !pq.isEmpty(); j++) {
                candidates.add(pq.poll());
            }
        }

        if (candidates.size() < x) return -1;

        Collections.sort(candidates, Collections.reverseOrder());

        long maxSum = 0;
        for (int i = 0; i < x; i++) {
            maxSum += candidates.get(i);
        }

        return maxSum;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<List<Integer>> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            data.add(row);
        }

        List<Integer> factor = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            factor.add(scanner.nextInt());
        }

        int x = scanner.nextInt();

        System.out.println(Result.findMaxValue(factor, data, x));

        scanner.close();
    }
}
