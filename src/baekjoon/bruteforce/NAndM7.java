package baekjoon.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15656
 * N과M(7)
 */
public class NAndM7 {
	static StringBuilder sb;
	static int[] a = new int[9], d = new int[9];
	
	public static void main(String[] args) {
		sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a, 0, n);

		move(0, n, m);
		System.out.println(sb);
	}

	public static void move(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				sb.append(d[i]).append(" ");
			}
			sb.append("\n");
			return ;
		}
		
		if (index >= n) {
			return ;
		}
		
		for (int i = 0; i < n; i++) {
			d[index] = a[i];
			move(index + 1, n, m);
		}
	}

}