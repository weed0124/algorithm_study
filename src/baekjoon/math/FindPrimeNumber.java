package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1978
 * 소수 찾기
 */
public class FindPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		while (n-- > 0) {
			int numb = sc.nextInt();
			
			if (isPrime(numb)) {
				result += 1;
			}
		}
		
		System.out.println(result);
	}
	
	/*
	 * 어떤 수 N이 소수인지 아닌지 판별하려면 2부터 N-1까지 체크하는 경우도 있지만 그 경우 시간복잡도 O(N)
	 * N이 소수가 아니라면 N = a * b로 나타낼 수 있고, 두 수 a와 b의 차이가 가장 작은 경우는 루트N
	 * 루트 N까지만 검사해보면 됨 시간복잡도 O(루트N)
	 */
	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
