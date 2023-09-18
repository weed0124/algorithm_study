package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2004
 * 조합 0의 개수
 * 
 * n과 m의 크기 제한으로 인해 long으로 선언하여 처리
 */
public class CombinationZeroCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long twoCount = 0;
		long fiveCount = 0;
		
		for (long i = 2; i <= n; i *= 2) {
			twoCount += n / i;
		}
		
		for (long i = 2; i <= (n - m); i *= 2) {
			twoCount -= (n - m) / i;
		}
		
		for (long i = 2; i <= m; i *= 2) {
			twoCount -= m / i;
		}
		
		for (long i = 5; i <= n; i *= 5) {
			fiveCount += n / i;
		}
		
		for (long i = 5; i <= (n - m); i *= 5) {
			fiveCount -= (n - m) / i;
		}
		
		for (long i = 5; i <= m; i *= 5) {
			fiveCount -= m / i;
		}
		
		System.out.println(Math.min(twoCount, fiveCount));
	}
}
