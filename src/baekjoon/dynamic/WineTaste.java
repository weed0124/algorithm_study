package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2156
 * 포도주 시식
 * 
 * 3번 연속 마시지 못함 -> i번째 포도주를 마시지 않는 경우, 1번 마시는 경우, 2번 마시는 경우로 나눌 수 있음
 * 포도주를 마시지 않는 경우 : D[i - 1]
 * 1번 마시는 경우 : D[i - 2] + A[i]
 * 2번 마시는 경우 : D[i - 3] + A[i - 1] + A[i]
 */
public class WineTaste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1], d = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		
		d[1] = a[1];
		
		if (n >= 2) {
			d[2] = a[1] + a[2];
		}
		
		for (int i = 3; i <= n; i++) {
			d[i] = d[i - 1];
			if (d[i] < d[i - 2] + a[i]) {
				d[i] = d[i - 2] + a[i];
			}
			
			if (d[i] < d[i - 3] + a[i - 1] + a[i]) {
				d[i] = d[i - 3] + a[i - 1] + a[i];
			}
		}
		
		System.out.println(d[n]);
	}
}
