package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/15651
 * N과M(3)
 * 
 * N과 M1 과 같은 방식으로 해결하면 되고, 중복제거 조건이 없어졌으므로 중복제거하는 로직을 제거하여 처리하면 됨 
 */
public class NAndM3 {
	static StringBuilder sb;
	static int[] a = new int[9];
	
	public static void move(int index, int n, int m) {
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
		
		for (int i = 1; i <= n; i++) {
			a[index] = i;
			move (index + 1, n, m);
		}
	}
	
	public static void main(String[] args) throws IOException {
		sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		move(0, n, m);
		System.out.println(sb);
	}
}
