package com.interviews.educative.arrays;

import java.util.Arrays;

public class E_RotateArrayByNElements {

	private static final int[] INPUT = { 1, 2, 3, 4, 5 };

	private static final int N = 2;

	public static void main(String[] args) {
		rotateArrayByNElements(INPUT, N);

		System.out.println(Arrays.toString(INPUT));
	}

	private static void rotateArrayByNElements(int[] input, int n) {
		if (input == null || input.length == 0) {
			return;
		}

		n = n % input.length;

		if (n == 0) {
			return;
		}

		if (n < 0) {
			n = n + input.length;
		}

		rotateElements(input, 0, n - 1);
		rotateElements(input, n, input.length - 1);
		rotateElements(input, 0, input.length - 1);
	}

	private static void rotateElements(int[] input, int low, int high) {
		while (low < high) {
			int buffer = input[low];
			input[low++] = input[high];
			input[high--] = buffer;
		}
	}

}
