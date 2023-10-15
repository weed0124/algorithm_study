package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/3085
 * 사탕 게임
 * 
 * 한칸에 사방으로 해야될것같지만 모서리가 아닌부분은 중복이되어 우측과 아래만 확인하면 됨
 */
public class CandyGame {
	public static int check(char[][] c) {
		int n = c.length;
		int result = 1;
		
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 0; j < n; j++) {
				if (j < n - 1 && c[i][j] == c[i][j + 1]) {
					count++;
					if (result < count) {
						result = count;
					}
				} else {
					count = 1;
				}
			}
			
			count = 1;
			
			for (int j = 0; j < n; j++) {
				if (j < n - 1 && c[j][i] == c[j + 1][i]) {
					count++;
					if (result < count) {
						result = count;
					}
				} else {
					count = 1;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] a = new char[n][n];
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - 1) {
					char t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t;
					
					int count = check(a);
					if (result < count) {
						result = count;
					}
					
					t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t;
				}
			}
			
			for (int j = 0; j < n; j++) {
				if (j < n - 1) {
					char t = a[j][i];
					a[j][i] = a[j + 1][i];
					a[j + 1][i] = t;
					
					int count = check(a);
					if (result < count) {
						result = count;
					}
					
					t = a[j][i];
					a[j][i] = a[j + 1][i];
					a[j + 1][i] = t;
				}
			}
		}
		System.out.println(result);
	}
}
