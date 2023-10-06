package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15988
 * 1,2,3 더하기 3
 */
public class OneTwoThreeSum3 {
	public static final long mod = 1000000009L;
	public static final int limit = 1000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] d = new long[limit + 1];
		d[0] = 1;
		
		for (int i = 1; i <= limit; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i - j >= 0) {
					d[i] += d[i - j];
				}
			}
			d[i] %= mod;
		}
		
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
	}
}
