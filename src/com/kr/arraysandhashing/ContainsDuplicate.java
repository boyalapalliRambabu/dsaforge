package com.kr.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1 };

//		burteforce
		boolean res = solution(arr);
		System.out.println(res);

		boolean res1 = solutionOptimal(arr);
		System.out.println(res1);

	}

//	Time Complexity: O(n) average
//	Space Complexity: O(n)
	private static boolean solutionOptimal(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int val : arr) {
			if (set.contains(val)) {
				return true;
			}
			set.add(val);
		}
		return false;
	}

//	Time Complexity: O(n²)
//	Space Complexity: O(1)
	private static boolean solution(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
