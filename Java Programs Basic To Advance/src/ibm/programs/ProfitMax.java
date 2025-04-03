package com.ibm.programs;

import java.io.*;
import java.util.*;

public class ProfitMax {

	public static class Result {
		
		public static int calculateMaximumProfit(List<Integer> cost, int x) {
			final int MOD = 1_000_000_007;
			int n = cost.size();

			int[] dp = new int[x + 1];

			for (int i = 0; i < n; i++) {
				int currentCost = cost.get(i);

				int currentProfit = modPow(2, i, MOD);

				for (int j = x; j >= currentCost; j--) {
					dp[j] = Math.max(dp[j], (dp[j - currentCost] + currentProfit) % MOD);
				}
			}

			int maxProfit = 0;
			for (int j = 0; j <= x; j++) {
				maxProfit = Math.max(maxProfit, dp[j]);
			}

			return maxProfit;
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
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> cost = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			cost.add(Integer.parseInt(bufferedReader.readLine().trim()));
		}

		int x = Integer.parseInt(bufferedReader.readLine().trim());

		int result = Result.calculateMaximumProfit(cost, x);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
