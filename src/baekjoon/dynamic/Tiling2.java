package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11727
 * 2 * n 타일링2
 */
public class Tiling2 {
	public static int[] d;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1 <= n <= 1000
		
		d = new int[n + 1];
		d[0] = 1;
		d[1] = 1;
		System.out.println(solution(n));
	}
	
	// 2*n크기의 직사각형을 채우는 방법의 수를 d[n]이라 할때 
	static int solution(int n) {

		/** 1번 재귀로 해결하였으나 문제에서 요구한 제한시간에 걸려 변경
		// d[1] = 1
		if (n == 1) {
			return 1;
		}
		
		// d[2] = 2
		if (n == 2) {
			return 2;
		}
		 
		// Memoization
		if (d[n] > 0) {
			return d[n];
		}
		
		// 직사각형 (1 * 2)의 경우의 수 + 직사각형 (2 * 1)의 경우의 수 + 직사각형 (2 * 2)의 경우의 수
		// 2 * 1과 2 * 2는 동일하여 *2
		d[n] = solution(n - 1) + (solution(n - 2) * 2);
		
		return d[n] % 10007;
		**/
		
		for (int i = 2; i <= n; i++) {
			d[i] = d[i - 1] + (d[i - 2] * 2);
			d[i] %= 10007;
		}
		
		return d[n];
	}
}
