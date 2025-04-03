package com.ibm.programs;

import java.util.*;

public class ClassPhoto {

    public static int countStudents(List<Integer> height) {
        List<Integer> sortedHeight = new ArrayList<>(height);
        Collections.sort(sortedHeight);
        int count = 0;

        for (int i = 0; i < height.size(); i++) {
            if (!height.get(i).equals(sortedHeight.get(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            height.add(scanner.nextInt());
        }
        System.out.println(countStudents(height));
        scanner.close();
    }
}

