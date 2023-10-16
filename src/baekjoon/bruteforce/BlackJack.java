package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2798
 * 블랙잭
 * 
 * N개의 카드 중 3개를 뽑아 M보다 작으면서 근접한 값을 구해야하므로
 * 중복을 적용하지 않도록 i = 0 ~ N - 2, j = i + 1 ~ N - 1, k = j + 1 ~ N의 값으로 세개의 중첩반복문을 돌려 순차탐색한다
 */
public class BlackJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < n - 2; i++) { 
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int temp = a[i] + a[j] + a[k];
					if (m >= temp && sum < temp) {
						sum = temp;
					}
					
					if (m == sum) {
						break;
					}
					
					if (m < sum) {
						continue;
					}
					
				}
			}
		}
		System.out.println(sum);
	}
}
