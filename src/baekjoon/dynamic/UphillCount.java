package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11057
 * 오르막 수
 * 
 * 1 <= N <= 1000
 * D[i][j] = 길이가 i고 마지막숫자가 j인 오르막수의 개수
 * D[1][i] = 1
 * D[i][j] += D[i - 1][k] (0 <= k <= j)
 */
public class UphillCount {
	static final int mod = 10007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] d = new int[n + 1][10];
		
		// 길이가 1인 경우에 대한 초기화
		for (int i = 0; i < 10; i++) {
			d[1][i] = 1;
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					d[i][j] += d[i - 1][k];
					d[i][j] %= mod;
				}
			}
		}
		
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result += d[n][i];
		}
		System.out.println(result % mod);
	}
}
