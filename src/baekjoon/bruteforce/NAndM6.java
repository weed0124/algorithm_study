package baekjoon.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15655
 * N과M(6)
 * 
 * N과M2문제와 동일한 방법으로 풀면 되며 1부터 N까지의 수를 출력하던 것에서 입력받은수로 처리하면 됨
 * O(2ⁿ)
 */
public class NAndM6 {
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

		move(0, 0, n, m);
		System.out.println(sb);
	}

	public static void move(int index, int selected, int n, int m) {
		if (selected == m) {
			for (int i = 0; i < m; i++) {
				sb.append(d[i]).append(" ");
			}
			sb.append("\n");
			
			return ;
		}
		
		if (index >= n) {
			return ;
		}
		
		d[selected] = a[index];
		move(index + 1, selected + 1, n, m);
		
		d[selected] = 0;
		move(index + 1, selected, n, m);
	}
}