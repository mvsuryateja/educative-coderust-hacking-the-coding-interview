package com.interviews.educative.arrays;

public class H_MaxSingleSellProfit {

	private static final int[] INPUT = { 1, 2, 3, 4, 3, 2, 1, 2, 5 };

	public static void main(String[] args) {
		Tuple<Integer, Integer> result = findMaximumSingleSellProfit(INPUT);

		System.out.println(result);
	}

	private static Tuple<Integer, Integer> findMaximumSingleSellProfit(int[] input) {
		if (input == null || input.length < 2) {
			return null;
		}

		int currentBuy = input[0];
		int globalSell = input[1];
		int globalProfit = globalSell - currentBuy;
		int currentProfit = Integer.MIN_VALUE;

		for (int i = 1; i < input.length; i++) {
			currentProfit = input[i] - currentBuy;

			if (currentProfit > globalProfit) {
				globalProfit = currentProfit;
				globalSell = input[i];
			}

			if (currentBuy > input[i]) {
				currentBuy = input[i];
			}
		}

		return new Tuple<Integer, Integer>(globalSell - globalProfit, globalSell);
	}

}

class Tuple<X, Y> {
	public X x;
	public Y y;

	public Tuple(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " -> " + y;
	}
}