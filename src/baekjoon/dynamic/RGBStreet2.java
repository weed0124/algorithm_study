package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/17404
 * RGB거리2
 * 
 * 기존 문제의 조건에서 1번과 N번은 인접하면 안된다는 조건이 추가됨(원형)
 * 기존 직선거리 문제와 동일하게 풀고
 * 1번에 색깔을 고정시켜 N번에 올수있는 색을 고정시킨 후 최소값을 구하여 풀도록한다
 * 1번 -> N번
 * 빨강	 파랑
 * 빨강	 초록
 * 초록 	 파랑
 * 초록	 빨강
 * 파랑	 초록
 * 파랑	 빨강
 */
public class RGBStreet2 {
	static final int max = 99999999;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n + 1][3], d = new int[n + 1][3];
		int result = max;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					d[1][j] = a[1][j];
				} else {
					d[1][j] = max;
				}
			}
			
			for (int k = 2; k <= n; k++) {
				d[k][0] = Math.min(d[k - 1][1], d[k - 1][2]) + a[k][0];
				d[k][1] = Math.min(d[k - 1][0], d[k - 1][2]) + a[k][1];
				d[k][2] = Math.min(d[k - 1][0], d[k - 1][1]) + a[k][2];
			}
			
			for (int k = 0; k < 3; k++) {
				if (i == k) {
					continue;
				}
				result = Math.min(result, d[n][k]);
			}
		}
		System.out.println(result);
	}
}
