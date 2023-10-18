package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15654
 * N과M(5)
 * 
 */
public class NAndM5 {
	static StringBuilder sb;
	static boolean[] c = new boolean[9];
	static int[] a = new int[9];
	static int[] d = new int[9];
	
	public static void move(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				sb.append(d[i]);
				if (i < m - 1) {
					sb.append(" ");
				}
			}
			sb.append("\n");
			return ;
		}
		
		for (int i = 0; i < n; i++) {
			if (c[i]) {
				continue;
			}
			c[i] = true;
			d[index] = a[i];
			move(index + 1, n, m);
			c[i] = false;
		}
	}
	
	public static void main(String[] args) {
		sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		move(0, n, m);
		System.out.println(sb);
	}
}
