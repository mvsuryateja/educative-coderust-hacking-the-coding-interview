package com.interviews.educative.arrays;

public class F_BinraySearchRange {

	private static int[] INPUT = { 1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6 };

	private static int QUERY = 0;

	public static void main(String[] args) {
		int low = binarySearchForStartingIndex(INPUT, QUERY);
		int high = binarySearchForEndingIndex(INPUT, QUERY);

		if (low < 0) {
			System.err.println("Not found");
		} else {
			System.out.println("Found range: " + low + " - " + high);
		}
	}

	private static int binarySearchForStartingIndex(int[] input, int query) {
		int low = 0;
		int high = input.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (input[mid] == query) {
				high = mid - 1;
			} else if (input[mid] < query) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		if (low >= 0 && low < input.length && input[low] == query) {
			return low;
		}

		return -1;
	}

	private static int binarySearchForEndingIndex(int[] input, int query) {
		int low = 0;
		int high = input.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (input[mid] == query) {
				low = mid + 1;
			} else if (input[mid] < query) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		if (high >= 0 && high < input.length && input[high] == query) {
			return high;
		}

		return -1;
	}

}
