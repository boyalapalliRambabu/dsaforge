package com.kr.arraysandhashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

//		bruteforce

		int res[] = solution(nums, target);
		System.out.println(Arrays.toString(res));
//      optimal
		int res1[] = solution1(nums, target);
		System.out.println(Arrays.toString(res1));
	}

	private static int[] solution1(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int val = target - nums[i];

			if (map.containsKey(val)) {
				return new int[] { map.get(val), i };
			}
			map.put(nums[i], i);
		}

		return new int[] { -1 - 1 };
	}

	private static int[] solution(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1 - 1 };
	}

}
