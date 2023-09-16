package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1929
 * N이상 M이하의 소수를 모두 출력
 */
public class FindPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean[] check = new boolean[m + 1];
		
		check[0] = check[1] = true; // 0과 1은 소수가 아니므로 제외
		
		for (int i = 2; i * i <= m; i++) { // 2부터 루트b까지 확인
			if (check[i] == true) {
				continue;
			}
			for (int j = i * 2; j <= m; j += i) {
				check[j] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int k = n; k <= m; k++) {
			if (check[k] == false) {
				sb.append(k + "\n");
			}
		}
		System.out.println(sb);
	}
}
