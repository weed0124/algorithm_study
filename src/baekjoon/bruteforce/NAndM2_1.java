package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/15650
 * N과M(2)
 * 
 * 수를 중복 없이 고르고 오름차순으로 되려면 가장 작은 수인 1부터 수를 선택했는지 안했는지 처리하면 됨
 * 
 * 1 ~ N까지의 수를 각 개별의 숫자를 선택하는지, 안하는지 두가지의 경우로 N * N 만큼의 경우의수가 있어 O(2ⁿ)이 나옴
 */
public class NAndM2_1 {
	static final int[] a = new int[10];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		move(1, 0, n, m);
		
	}

	public static void move(int index, int selected, int n, int m) {
		
		if (selected == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(a[i]);
				if (i != m - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
			return;
		}
		
		if (index > n) {
			return ;
		}
		// 해당 숫자 선택 시
		a[selected] = index;
		move(index + 1, selected + 1, n, m);
		
		// 해당 숫자 미선택 시
		a[selected] = 0;
		move(index + 1, selected, n, m);
	}
}
