package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/15652
 * N과M(4)
 * 
 * N과 M2와 같은 방식으로 해결하면 되고, 오름차순 처리하던 부분만 변경해주면됨
 */
public class NAndM4 {
	static StringBuilder sb;
	static int[] a = new int[9];
	static boolean[] c = new boolean[9];
	
	public static void move(int index, int start, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				sb.append(a[i]);
				if (i < m - 1) {
					sb.append(" ");
				}
			}
			sb.append("\n");
			return ;
		}
		
		for (int i = start; i <= n; i++) {
			c[i] = true;
			a[index] = i;
			move (index + 1, i, n, m);
			c[i] = false;
		}
	}
	
	public static void main(String[] args) throws IOException {
		sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		move(0, 1, n, m);
		System.out.println(sb);
	}
}
