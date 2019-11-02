package com.interviews.educative.arrays;

import java.util.Arrays;

public class I_QuickSort {

	private static final int[] INPUT = { 33, 6, 21, 12, 19, 29, 38, 22, 14, 40 };

	public static void main(String[] args) {
		quickSort(INPUT);

		System.out.println(Arrays.toString(INPUT));
	}

	private static void quickSort(int[] input) {
		if (input == null || input.length < 2) {
			return;
		}

		quickSortRecursive(input, 0, input.length);
	}

	private static void quickSortRecursive(int[] input, int low, int high) {
		if (high - low < 2) {
			return;
		}

		int finalPivotIndex = finalizePrivotIndex(input, low, high);

		quickSortRecursive(input, low, finalPivotIndex);
		quickSortRecursive(input, finalPivotIndex + 1, high);
	}

	private static int finalizePrivotIndex(int[] input, int low, int high) {
		int pivot = input[low];

		int i = low;
		int j = high;

		while (i < j) {
			while (i < j && input[--j] >= pivot) {
				// Nothing
			}

			if (i < j) {
				input[i] = input[j];
			}

			while (i < j && input[++i] <= pivot) {
				// Nothing
			}

			if (i < j) {
				input[j] = input[i];
			}
		}

		input[j] = pivot;

		return j;
	}

}
