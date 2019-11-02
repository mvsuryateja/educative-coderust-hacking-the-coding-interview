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
		System.out.println(INPUT);
	}
	
}
