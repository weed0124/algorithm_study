package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/14002
 * 가장 긴 증가하는 부분 수열4(Longest Increasing Subsequence)
 * 
 * 주어진 수열 내의 값을 비교하고 그에 해당되는 증가하는 부분 수열의 길이를 비교하여 주며
 * 제일 긴 길이의 값에서 역추적할수있도록 위치를 저장해둔다.
 */
public class LIS4 {
	static int[] a, d, v;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		d = new int[n + 1];
		v = new int[n + 1];
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			v[i] = -1;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
					v[i] = j;
				}
			}
		}
		
		int result = d[0];
		int p = 0;
		for (int i = 0; i < n; i++) {
			if (result < d[i]) {
				result = d[i];
				p = i;
			}
		}
		System.out.println(result);
		print(p);
		System.out.println();
	}
	
	static void print(int p) {
		if (p == -1) {
			return ;
		}
		
		print(v[p]);
		System.out.print(a[p] + " ");
	}
}
