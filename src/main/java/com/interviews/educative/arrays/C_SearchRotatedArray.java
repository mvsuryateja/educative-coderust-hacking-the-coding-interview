package com.interviews.educative.arrays;

public class C_SearchRotatedArray {

	private static int[] INPUT = { 6, 7, 8, 1, 2, 3, 4, 5 };

	private static int QUERY = 3;

	public static void main(String[] args) {
		int index = binarySearchOnRotatedArray(INPUT, QUERY);

		if (index >= 0) {
			System.out.println("Found: " + QUERY + " at index: " + index);
		} else {
			System.err.println("Not found");
		}
	}

	private static int binarySearchOnRotatedArray(int[] input, int query) {
		if (input == null || input.length == 0) {
			return -1;
		}

		return recursiveBinarySearchOnRotatedArray(input, query, 0, input.length - 1);
	}

	private static int recursiveBinarySearchOnRotatedArray(int[] input, int query, int low, int high) {
		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		if (input[mid] == query) {
			return mid;
		}

		if (input[low] < input[mid] && input[low] <= query && query < input[mid]) {
			return recursiveBinarySearchOnRotatedArray(input, query, low, mid - 1);
		} else if (input[mid] < input[high] && input[mid] < query && query <= input[high]) {
			return recursiveBinarySearchOnRotatedArray(input, query, mid + 1, high);
		} else if (input[mid] <= input[low]) {
			return recursiveBinarySearchOnRotatedArray(input, query, low, mid - 1);
		} else if (input[high] <= input[mid]) {
			return recursiveBinarySearchOnRotatedArray(input, query, mid + 1, high);
		}

		return -1;
	}

}
