package com.ibm.programs;

import java.util.*;

public class MaxPairs {

    public static int findNumOfPairs(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);

        int count = 0;
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) > b.get(j)) {
                count++;
                j++;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b.add(scanner.nextInt());
        }

        System.out.println(findNumOfPairs(a, b));

        scanner.close();
    }
}

