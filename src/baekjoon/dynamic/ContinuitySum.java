package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1912
 * 연속합
 * 
 * 주어진 수열내에서 양수 구간만의 합을 구한뒤 비교하여 제일 큰수를 출력하면 된다.
 */
public class ContinuitySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = a[i];
			if (i == 0) {
				continue;
			}
			
			if (a[i] + d[i - 1] > d[i]) {
				d[i] = d[i - 1] + a[i]; 
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
