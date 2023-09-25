package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11052
 * 카드 구매하기
 */
public class CardPack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		
		int[] d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], d[i - j] + a[j]);
			}
		}
		
		System.out.println(d[n]);
	}
}
