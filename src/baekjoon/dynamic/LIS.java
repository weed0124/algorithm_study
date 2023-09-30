package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11053
 * 가장 긴 증가하는 부분 수열(Longest Increasing Subsequence)
 * 
 * 주어진 수열 내의 값을 비교하고 그에 해당되는 증가하는 부분 수열의 길이를 비교하여 준다.
 */
public class LIS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n], d = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		
		int result = d[0];
		for (int i = 0; i < n; i++) {
			if (result < d[i]) {
				result = d[i];
			}
		}
		System.out.println(result);
	}
}
