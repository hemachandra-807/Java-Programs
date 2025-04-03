package com.ibm.programs;

import java.io.*;
import java.util.*;

class ProfitCalculator {

	public static int calculateMaximumProfit(List<Integer> cost, int x) {
		final int MOD = 1_000_000_007;
		int n = cost.size();

		List<int[]> items = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			items.add(new int[] { cost.get(i), i }); 
		}

		items.sort(Comparator.comparingInt(a -> a[0]));

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		long currentCostSum = 0;
		long currentProfit = 0;
		long maxProfit = 0;

		for (int[] item : items) {
			int itemCost = item[0];
			int itemProfit = modPow(2, item[1], MOD);

			currentCostSum += itemCost;
			minHeap.offer(itemCost); 
			currentProfit = (currentProfit + itemProfit) % MOD;

			while (currentCostSum > x) {
				int removedCost = minHeap.poll();
				currentCostSum -= removedCost;
				int removedIndex = findItemIndex(cost, removedCost); 
				int removedProfit = modPow(2, removedIndex, MOD); 
				currentProfit = (currentProfit - removedProfit + MOD) % MOD; 
			}

			maxProfit = Math.max(maxProfit, currentProfit);
		}

		return (int) maxProfit;
	}

	private static int modPow(int base, int exp, int mod) {
		long result = 1;
		long baseMod = base % mod;
		while (exp > 0) {
			if ((exp & 1) == 1) {
				result = (result * baseMod) % mod;
			}
			baseMod = (baseMod * baseMod) % mod;
			exp >>= 1;
		}
		return (int) result;
	}

	private static int findItemIndex(List<Integer> cost, int removedCost) {
		for (int i = 0; i < cost.size(); i++) {
			if (cost.get(i) == removedCost) {
				return i; 
			}
		}
		return -1; 
	}
}

public class MainProgram {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> cost = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			cost.add(Integer.parseInt(bufferedReader.readLine().trim()));
		}

		int x = Integer.parseInt(bufferedReader.readLine().trim());

		int result = ProfitCalculator.calculateMaximumProfit(cost, x);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
