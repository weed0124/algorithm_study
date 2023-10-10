package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11055
 * 가장 큰 증가하는 부분 수열(Biggest Increasing Subsequence)
 * 
 * A[N]까지의 합을 D[N]라고 하면
 * D[N] = D[N - 1] + A[N]
 */
public class BIS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n], d = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			d[i] = a[i];
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && d[i] < d[j] + a[i]) {
					d[i] = d[j] + a[i];
				}
			}
		}
		
		int result = d[0];
		for (int i = 1; i < n; i++) {
			if (result < d[i]) {
				result = d[i];
			}
		}
		System.out.println(result);
	}
}
