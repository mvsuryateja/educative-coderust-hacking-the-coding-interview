package com.interviews.educative.arrays;

import java.util.ArrayList;

import com.interviews.educative.model.Tuple;

public class J_MergeOverlappingIntervals {

	static ArrayList<Tuple<Integer, Integer>> INPUT = new ArrayList<Tuple<Integer, Integer>>();

	static {
		INPUT.add(new Tuple<Integer, Integer>(2, 10));
		INPUT.add(new Tuple<Integer, Integer>(4, 12));
		INPUT.add(new Tuple<Integer, Integer>(13, 16));
		INPUT.add(new Tuple<Integer, Integer>(19, 20));
		INPUT.add(new Tuple<Integer, Integer>(20, 24));
	}

	public static void main(String[] args) {
		ArrayList<Tuple<Integer, Integer>> result = mergeIntervals(INPUT);

		System.out.println(result);
	}

	private static ArrayList<Tuple<Integer, Integer>> mergeIntervals(ArrayList<Tuple<Integer, Integer>> input) {
		if (input == null || input.isEmpty()) {
			return new ArrayList<Tuple<Integer, Integer>>();
		}

		ArrayList<Tuple<Integer, Integer>> result = new ArrayList<Tuple<Integer, Integer>>();

		Tuple<Integer, Integer> tuple = new Tuple<Integer, Integer>(input.get(0).x, input.get(0).y);

		for (Tuple<Integer, Integer> interval : input) {
			if (tuple.y >= interval.x) {
				tuple.y = interval.y;
				continue;
			}

			result.add(tuple);
			tuple = new Tuple<Integer, Integer>(interval.x, interval.y);
		}

		result.add(tuple);

		return result;
	}

}
