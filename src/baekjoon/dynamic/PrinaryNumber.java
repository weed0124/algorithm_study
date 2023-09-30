package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2193
 * 이친수
 * 
 * N자리 이친수의 개수로 올 수 있는 경우는 끝자리가 0일때와 1일때로 구분지어 보면
 * 
 * D[N][0] = D[N - 1][0] + D[N - 1][1]
 * D[N][1] = D[N - 1][0]
 */
public class PrinaryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] d = new long[n + 1][2];
		
		// 길이가 1이고 0이 오는 경우는 0으로 시작하는경우여서 0
		d[1][0] = 0;
		// 1로 시작하는 경우는 제한 없음
		d[1][1] = 1;
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 1; j++) {
				if (j == 0) {
					d[i][j] += d[i - 1][0] + d[i - 1][1];
				}
				
				if (j == 1) {
					d[i][j] += d[i - 1][0];
				}
			}
		}
		
		long result = 0;
		for (int i = 0; i <= 1; i++) {
			result += d[n][i];
		}
		System.out.println(result);
	}
}
