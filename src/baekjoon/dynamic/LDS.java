package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11722
 * 가장 긴 감소하는 부분 수열(Lowest Decreasing Subsequence)
 * 
 * LIS와 반대로 뒤에서부터 큰수를 비교해주면 된다.
 */
public class LDS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n], d = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = n - 1; i >= 0; i--) {
			d[i] = 1;
			for (int j = i; j < n; j++) {
				if (a[i] > a[j] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
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
