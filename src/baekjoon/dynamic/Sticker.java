package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9465
 * 스티커
 * 
 * 스티커를 안뜯는경우[0], 위쪽 뜯는경우[1], 아래쪽 뜯는경우[2]으로 나누어 가장 큰 값을 더해주면 된다
 * result = max(D[N][0], D[n][1], D[n][2])
 * 
 */
public class Sticker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int n = sc.nextInt();
			long[][] a = new long[n + 1][2];
			long[][] d = new long[n + 1][3];
			
			for (int i = 1; i <= n; i++) {
				a[i][0] = sc.nextInt();
			}
			
			for (int i = 1; i <= n; i++) {
				a[i][1] = sc.nextInt();
			}
			
			// 0 : 안찢는경우, 1 : 위쪽을 뜯는경우, 2 : 아래쪽을 뜯는경우
			for (int i = 1; i <= n; i++) {
				d[i][0] = Math.max(Math.max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
				d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + a[i][0];
				d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + a[i][1];
			}
			
			long result = 0;
			result = Math.max(Math.max(d[n][0], d[n][1]), d[n][2]);
			System.out.println(result);
		}
	}
}
