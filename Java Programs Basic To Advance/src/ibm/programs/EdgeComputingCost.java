package com.ibm.programs;

public class EdgeComputingCost {

	public static long getMinimumCost(int edgeDeviceCost, int inputPeripheralCost, int bundleCost, int x, int y) {
		long minCost = Long.MAX_VALUE;

		int maxBundles = Math.max(x, y);

		for (int b = 0; b <= maxBundles; b++) {
			int remainingEdgeDevices = Math.max(0, x - b);
			int remainingPeripherals = Math.max(0, y - b);

			long cost = (long) b * bundleCost + (long) remainingEdgeDevices * edgeDeviceCost
					+ (long) remainingPeripherals * inputPeripheralCost;

			minCost = Math.min(minCost, cost);
		}

		return minCost;
	}

	public static void main(String[] args) {
		int edgeDeviceCost = 1;
		int inputPeripheralCost = 20;
		int bundleCost = 5;
		int x = 9;
		int y = 1;

		System.out.println(getMinimumCost(edgeDeviceCost, inputPeripheralCost, bundleCost, x, y));
	}
}
