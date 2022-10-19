package com.selfpractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSet {
	public static Set<Integer> removeDuplicates(int[] a) {
		Set<Integer> set = new HashSet<>();
		for (int n: a) {
			set.add(n);
		}
		return set;
	}
	public static void main(String[] args) {
		int[] a = {20,30,20,40,10,10,30,50};
		System.out.println(removeDuplicates(a));
	}
}
