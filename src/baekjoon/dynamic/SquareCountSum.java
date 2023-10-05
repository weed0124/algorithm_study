package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1699
 * 제곱수의 합
 * 
 * D[N] = D[N - L * L] + 1
 */
public class SquareCountSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			d[i] = i; // i는 1의 제곱으로 i개의 합으로 표현할 수 있어 i보다 큰 수로 나올 수가 없음
			for (int j = 1; j * j <= i; j++) {
				if (d[i] > d[i - j * j] + 1) {
					d[i] = d[i - j * j] + 1;
				}
			}
		}
		
		System.out.println(d[n]);
	}
}
