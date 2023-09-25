package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15990
 * 1,2,3 더하기5
 */
public class OneTwoThreeSum5 {
	public static void main(String[] args) {
		final int limit = 100000;
		final long mod = 1000000009L;
		
		Scanner sc = new Scanner(System.in);
		long[][] d = new long[limit + 1][4];
		
		for (int i = 1; i <= limit; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i - j >= 0) {
					if (j == 1) {
						d[i][1] = d[i - j][2] + d[i - j][3];
						if (i == 1) {
							d[i][1] = 1;
						}
					}
					if (j == 2) {
						d[i][2] = d[i - j][1] + d[i - j][3];	
						if (i == 2) {
							d[i][2] = 1;
						}
					}
					if (j == 3) {
						d[i][3] = d[i - j][1] + d[i - j][2];
						if (i == 3) {
							d[i][3] = 1;
						}
					}
				}
				d[i][j] %= mod;
			}
		}
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println((d[n][1] + d[n][2] + d[n][3]) % mod);
		}
	}
} 
