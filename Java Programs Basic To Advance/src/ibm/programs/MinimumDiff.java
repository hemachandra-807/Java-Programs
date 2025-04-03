package com.ibm.programs;

import java.util.*;

public class MinimumDiff {

	public static void minimumDifference(List<Integer> measurements) {
		Collections.sort(measurements);

		int minDiff = Integer.MAX_VALUE;
		List<String> result = new ArrayList<>();

		for (int i = 1; i < measurements.size(); i++) {
			int diff = measurements.get(i) - measurements.get(i - 1);

			if (diff < minDiff) {
				minDiff = diff;
				result.clear();
				result.add(measurements.get(i - 1) + " " + measurements.get(i));
			} else if (diff == minDiff) {
				result.add(measurements.get(i - 1) + " " + measurements.get(i));
			}
		}

		for (String pair : result) {
			System.out.println(pair);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		List<Integer> measurements = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			measurements.add(scanner.nextInt());
		}

		minimumDifference(measurements);

		scanner.close();
	}
}
