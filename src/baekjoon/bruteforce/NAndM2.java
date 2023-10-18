package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/156500
 * N과M(2)
 * 
 * N과 M1 과 같은 방식으로 해결하면 되고, 추가 조건인 오름차순으로 출력이 되게 하려면
 * 인덱스를 체크하고 해당 인덱스에 어떤수를 사용했는지와 사용한값 + 1 ~ N까지 체크하여 중복이 안되게 처리 
 */
public class NAndM2 {
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
			if (c[i]) {
				continue;
			}
			c[i] = true;
			a[index] = i;
			move (index + 1, i + 1, n, m);
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
