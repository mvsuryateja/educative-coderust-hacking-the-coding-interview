package com.interviews.educative.arrays;

import java.util.Arrays;

public class G_MoveZerosToLeft {

	private static final int[] INPUT = { 1, 0, 10, -1, 11, 5, 0, -7, 10, 25, -35 };

	public static void main(String[] args) {
		moveZerosToLeft(INPUT);

		System.out.println(Arrays.toString(INPUT));
	}

	private static void moveZerosToLeft(int[] input) {
		if (input == null || input.length == 0) {
			return;
		}

		int writer = input.length - 1;

		for (int reader = input.length - 1; reader >= 0; reader--) {
			if (input[reader] == 0) {
				continue;
			}

			if (reader == writer) {
				writer--;
				continue;
			}

			input[writer] = input[reader];
			input[reader] = 0;

			writer--;
		}
	}

}
