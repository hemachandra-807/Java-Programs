package com.amazon.programs;

import java.util.*;

public class WarehousePlacement {

    public static int findOptimumMinSum(List<Integer> centers) {
        Collections.sort(centers);
        
        int n = centers.size();
        int minSum = Integer.MAX_VALUE;

        boolean allSame = true;
        for (int i = 1; i < n; i++) {
            if (!centers.get(i).equals(centers.get(0))) {
                allSame = false;
                break;
            }
        }
        if (allSame) {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            List<Integer> group1 = centers.subList(0, i);
            List<Integer> group2 = centers.subList(i, n);

            int median1 = group1.get(group1.size() / 2);
            int median2 = group2.get(group2.size() / 2);

            int sum1 = calculateSum(group1, median1);
            int sum2 = calculateSum(group2, median2);

            minSum = Math.min(minSum, sum1 + sum2);
        }

        return minSum;
    }

    private static int calculateSum(List<Integer> group, int median) {
        int sum = 0;
        for (int center : group) {
            sum += Math.abs(center - median);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> centers1 = Arrays.asList(1, 2, 3);
        System.out.println(findOptimumMinSum(centers1)); 

        List<Integer> centers2 = Arrays.asList(1, 1, 1);
        System.out.println(findOptimumMinSum(centers2)); 

        List<Integer> centers3 = Arrays.asList(1, 3, 6, 10);
        System.out.println(findOptimumMinSum(centers3)); 
    }
}