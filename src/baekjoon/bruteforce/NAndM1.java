package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/15649
 * N과M(1)
 * 
 * N과 M의 범위는 1 <= M <= N <= 8
 * N = 8, M = 7
 * N을 1번째 자리에 놓을 수 있는 수의 개수 : N
 * N을 2번째 자리에 놓을 수 있는 수의 개수 : N - 1
 * N을 3번째 자리에 놓을 수 있는 수의 개수 : N - 2
 * .....
 * 
 * 재귀함수로 처리하면 됨
 * 인덱스를 체크하고 해당 인덱스에 어떤수를 사용했는지 체크하여 중복이 안되게 처리 
 */
public class NAndM1 {
	static StringBuilder sb;
	static boolean[] c = new boolean[9];
	static int[] a = new int[9];
	
	public static void move(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				sb.append(a[i]);
				if (i != m - 1) {
					sb.append(" ");
				}
			}
			sb.append("\n");
			return ;
		}
		
		for (int i = 1; i <= n; i++) {
			if (c[i]) {
				continue;
			}
			c[i] = true;
			a[index] = i;
			move(index + 1, n, m);
			c[i] = false;
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
