package com.interviews.educative.arrays;

public class D_SmallestCommonNumber {

	private static final int[] INPUT1 = new int[] { 1, 6, 10, 14, 50 };
	private static final int[] INPUT2 = new int[] { -1, 6, 7, 8, 50 };
	private static final int[] INPUT3 = new int[] { 0, 6, 7, 10, 25, 30, 40 };

	public static void main(String[] args) {
		Integer result = getSmallestCommonNumber(INPUT1, INPUT2, INPUT3);

		if (result == null) {
			System.err.println("Common number not found");
		} else {
			System.out.println("Smallest common number: " + result);
		}
	}

	private static Integer getSmallestCommonNumber(int[] input1, int[] input2, int[] input3) {
		int i1 = 0, i2 = 0, i3 = 0;

		while (i1 <= input1.length && i2 < input2.length && i3 <= input3.length) {
			if (input1[i1] == input2[i2] && input2[i2] == input3[i3]) {
				return input1[i1];
			}

			if (input1[i1] <= input2[i2] && input1[i1] <= input3[i3]) {
				i1++;
			} else if (input2[i2] <= input1[i1] && input2[i2] <= input3[i3]) {
				i2++;
			} else if (input3[i3] <= input1[i1] && input3[i3] <= input2[i2]) {
				i3++;
			}
		}

		return null;
	}

}
