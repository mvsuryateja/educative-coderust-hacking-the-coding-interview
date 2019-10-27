package com.interviews.educative.arrays;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class B_MaxInSlidingWindow {

	private static int[] INPUT = { 10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67 };

	private static int WINDOW_SIZE = 3;

	public static void main(String[] args) {
		List<Integer> result = findMaxInSlidingWindow(INPUT, WINDOW_SIZE);

		System.out.println("Maximums in sliding window: " + result);
	}

	private static List<Integer> findMaxInSlidingWindow(int[] input, int windowSize) {
		if (input == null || input.length < 1) {
			return new ArrayList<Integer>();
		}

		if (windowSize > input.length) {
			return new ArrayList<Integer>();
		}

		Deque<Integer> buffer = new LinkedList<Integer>();

		for (int i = 0; i < windowSize; i++) {
			while (!buffer.isEmpty() && input[buffer.peekLast()] <= input[i]) {
				buffer.removeLast();
			}

			buffer.addLast(i);
		}

		List<Integer> result = new ArrayList<Integer>();

		for (int i = windowSize; i < input.length; i++) {
			result.add(input[buffer.peekFirst()]);

			while (!buffer.isEmpty() && buffer.peekFirst() <= i - windowSize) {
				buffer.removeFirst();
			}

			while (!buffer.isEmpty() && input[buffer.peekLast()] <= input[i]) {
				buffer.removeLast();
			}

			buffer.addLast(i);
		}

		result.add(input[buffer.peekFirst()]);

		return result;
	}

}
