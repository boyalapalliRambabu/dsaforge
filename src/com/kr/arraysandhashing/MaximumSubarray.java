package com.kr.arraysandhashing;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		bruteforce
		int res = solution(arr);
		System.out.println(res);

//		Kadane's Algorithm
		int res1 = solution1(arr);
		System.out.println(res1);
	}

	private static int solution1(int[] arr) {
		int maxSum = arr[0];
		int currentMax = 0;
		for (int val : arr) {
			if (currentMax < 0) {
				currentMax = 0;
			}
			currentMax += val;
			maxSum = Math.max(maxSum, currentMax);
		}
		return maxSum;
	}

	private static int solution(int[] arr) {

		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

}
