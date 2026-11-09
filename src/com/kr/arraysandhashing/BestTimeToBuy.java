package com.kr.arraysandhashing;

public class BestTimeToBuy {

	public static void main(String[] args) {

		int arr[] = { 10, 7, 5, 8, 11, 9 };
//		bruteforce
		int ans = solution(arr);
		System.out.println(ans);
//		Optimal
		int ans1 = solution1(arr);
		System.out.println(ans1);
	}

	private static int solution1(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		int profit = 0;
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			profit = Math.max(profit, arr[i] - min);
			min = Math.min(min, arr[i]);
		}

		return profit;
	}

	private static int solution(int[] arr) {
		int profit = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				profit = Math.max(profit, arr[j] - arr[i]);
			}
		}
		return profit;
	}
}
