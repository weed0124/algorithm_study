package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1748
 * 수 이어 쓰기1
 * 
 * N의 범위가 100,000,000이므로 모든 경우의수를 체크 시 시간제한에 걸림
 * 자릿수가 동일한 숫자끼리 체크해서 최소한으로 경우의수를 체크해야함
 * 아래와 같이 1~9까지는 1자리, 10~99까지는 1~n자리수까지를 체크 후 n까지의 자리수를 더해주면된다.
 * 
 * ex) 120
 * 1~9 : (9 - 1 + 1) * 1
 * 10~99 : (99 - 10 + 1) * 2
 * 100~999 : (120 - 100 + 1) * 3
 * 9 + 180 + 63 = 252
 */
public class NumberContinueWrite1 {
	static long limit = 100000000L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long result = 0;
		for (int start = 1, length = 1; start <= n; start *= 10, length++) {
			int end = start * 10 - 1;
			if (end > n) {
				end = n;
			}
			result += (long) (end - start + 1) * length;
		}
		
		System.out.println(result);
	}
}
