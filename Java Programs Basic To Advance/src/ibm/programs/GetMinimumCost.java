package com.ibm.programs;

import java.util.*;

class Test {
    public static long getMinimumCost(List<Integer> arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedNumbers = new ArrayList<>(freqMap.keySet());
        sortedNumbers.sort((a, b) -> {
            if (!Objects.equals(freqMap.get(a), freqMap.get(b))) {
                return freqMap.get(b) - freqMap.get(a);
            }
            return a - b;
        });

        List<Integer> optimalArr = new ArrayList<>();
        for (int num : sortedNumbers) {
            int count = freqMap.get(num);
            for (int i = 0; i < count; i++) {
                optimalArr.add(num);
            }
        }

        Set<Integer> seen = new HashSet<>();
        long minCost = 0;
        for (int num : optimalArr) {
            seen.add(num);
            minCost += seen.size();
        }

        return minCost;
    }

    public static void main(String[] args) {
        List<Integer> test1 = Arrays.asList(4, 3, 1, 1, 2, 2, 2, 3);
        System.out.println(getMinimumCost(test1));

        List<Integer> test2 = Arrays.asList(5, 1, 3, 3, 2, 2, 2, 5, 1);
        System.out.println(getMinimumCost(test2));
    }
}
