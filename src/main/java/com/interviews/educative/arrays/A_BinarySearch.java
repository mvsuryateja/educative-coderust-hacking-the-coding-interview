package com.interviews.educative.arrays;

public class A_BinarySearch {

	private static final int[] INPUT = { 1, 5, 17, 29, 42, 74, 89, 100 };

	private static final int QUERY = 1;

	private static final boolean RECURSIVE = true;

	public static void main(String[] args) {
		int index = binarySearch(INPUT, QUERY, RECURSIVE);

		if (index >= 0) {
			System.out.println("Found: " + QUERY + " at index: " + index);
		} else {
			System.err.println("Not found");
		}
	}

	private static int binarySearch(int[] input, int query, boolean recursive) {
		if (input == null || input.length == 0) {
			return -1;
		}

		return recursive ? recursiveBinarySearch(input, query, 0, input.length - 1)
				: iterativeBinarySearch(input, query);
	}

	private static int recursiveBinarySearch(int[] input, int query, int low, int high) {
		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		if (input[mid] == query) {
			return mid;
		}

		if (input[mid] > query) {
			return recursiveBinarySearch(input, query, low, mid - 1);
		}

		return recursiveBinarySearch(input, query, mid + 1, high);
	}

	private static int iterativeBinarySearch(int[] input, int query) {
		int low = 0;
		int high = input.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (input[mid] == query) {
				return mid;
			}

			if (input[mid] > query) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

}
