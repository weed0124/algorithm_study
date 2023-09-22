package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11726
 * 2 * n 타일링
 */
public class Tiling {
	public static int[] d;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1 <= n <= 1000
		
		d = new int[n + 1];
		System.out.println(solution(n));
	}
	
	// 2*n크기의 직사각형을 채우는 방법의 수를 d[n]이라 할때 
	static int solution(int n) {
		
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
		
		// 직사각형 (1 * 2)의 경우의 수 + 직사각형 (2 * 1)의 경우의 수
		d[n] = solution(n - 1) + solution(n - 2);
		
		return d[n] % 10007;
	}
}
