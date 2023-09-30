package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10844
 * 쉬운 계단 수
 * 
 * L이 마지막으로 오른 계단이라고 할때
 * N이 주어질때 길이가 N인 계단수를 구하는 경우는
 * 
 * n-1까지 오르고 L에서 한칸 오르거나 내려가는 경우이다.
 * 위의 경우를 점화식으로 만들어보면
 * 
 * D[N] = D[N - 1][L - 1] + D[N - 1][L + 1]이다
 * 위의 점화식에서 L = 0일때 L - 1, L = 9일때 L + 1이 불가하므로 두가지 경우를 제외한 경우를 추가해주면 된다.
 */
public class EasyStepCount {
	public static final long mod = 1000000000L;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] d = new int[n + 1][10];
		
		for (int i = 1; i <= 9; i++) {
			d[1][i] = 1;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				d[i][j] = 0;
				if (j - 1 >= 0) {
					d[i][j] += d[i - 1][j - 1];
				}
				
				if (j + 1 <= 9) {
					d[i][j] += d[i - 1][j + 1];
				}
				d[i][j] %= mod;
			}
		}
		
		long result = 0;
		for (int i = 0; i <= 9; i++) {
			result += d[n][i];
		}
		System.out.println(result % mod);
	}
}
