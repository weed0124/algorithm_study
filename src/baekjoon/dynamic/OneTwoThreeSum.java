package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9095
 * 1,2,3 더하기
 */
public class OneTwoThreeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(); // 0 < n < 11
		int[] d = new int[11];
		d[0] = 1;
		
		// d[n] = d[n - 1] + d[n - 2] + d[n - 3]
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i - j >= 0) {
					d[i] += d[i - j];
				}
			}
		}
		
		while (r-- > 0) {
			int n = sc.nextInt();
			
			System.out.println(d[n]);
		}
	}
}
