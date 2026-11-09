package com.kr.arraysandhashing;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] nums = { -2, 3, -4 };
		// bruetforce
		int res = solution(nums);
		System.out.println(res);
	}

	private static int solution(int[] nums) {
		int maxProd = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = i; j < nums.length; j++) {
				product *= nums[j];
				maxProd = Math.max(maxProd, product);
			}
		}
		return maxProd;
	}
}
