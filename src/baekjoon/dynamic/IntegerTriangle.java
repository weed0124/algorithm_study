package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1932
 * 정수 삼각형
 * 
 * D[i][j] = i행j열이 선택되었을때 최대합
 * 값이 선택되기전에 선택된 수는 (i - 1, j), (i - 1, j - 1) 두가지 밖에 없음
 * D[i][j] = max(D[i - 1][j], D[i - 1][j - 1]) + a[i][j]
 */
public class IntegerTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n], d = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		d[0][0] = a[0][0];
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				// 기본적으로 바로 아래의 값에 합을 넣어줌
				d[i][j] = d[i - 1][j] + a[i][j];
				// 넣어준값과 우측값을 비교
				if (j - 1 >= 0 && d[i][j] < d[i - 1][j - 1] + a[i][j]) {
					d[i][j] = d[i - 1][j - 1] + a[i][j];
				}
			}
		}
		
		// 마지막행의 첫번째값을 기준 
		int result = d[n - 1][0];
		for (int i = 1; i < n; i++) {
			if (result < d[n - 1][i]) {
				result = d[n - 1][i];
			}
		}
		System.out.println(result);
	}
}
