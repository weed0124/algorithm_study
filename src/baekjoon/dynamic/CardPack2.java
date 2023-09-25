package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/16194
 * 카드 구매하기2
 */
public class CardPack2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1], d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			d[i] = -1;
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (d[i] == -1) {
					d[i] = d[i - j] + a[j];
				} else {
					d[i] = Math.min(d[i], d[i - j] + a[j]);
				}
			}
		}
		
		System.out.println(d[n]);
	}
}
