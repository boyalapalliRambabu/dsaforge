package com.kr.arraysandhashing;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
//		bruteforce
		int res[] = solution(nums);
		System.out.println(Arrays.toString(res));

		int res1[] = solutionPrefix(nums);
		System.out.println(Arrays.toString(res1));
	}

	private static int[] solutionPrefix(int[] nums) {
		int n = nums.length;
		int result[] = new int[n];
		int prefix = 1;
		// Calculate prefix products
		for (int i = 0; i < n; i++) {
			result[i] = prefix;
			prefix *= nums[i];
		}
		int suffix = 1;
		// Calculate suffix products
		for (int i = n - 1; i >=     0; i--) {
			result[i] *= suffix;
			suffix *= nums[i];
		}

		return result;
	}

	private static int[] solution(int[] nums) {
		int n = nums.length;

		int result[] = new int[n];
		for (int i = 0; i < n; i++) {
			int product = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					product *= nums[j];
				}
			}
			result[i] = product;
		}
		return result;
	}

}
