package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1676
 * 팩토리얼 0의 개수
 */
public class FactorialZeroCount {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 0 <= n <= 500
		int result = 0;
		
		// 0이 나오는 경우는 2 * 5의 경우만 있고, 2는 5의 개수보다 적으니 5의 개수만 체크한다
		for (int i = 5; i <= n; i *= 5) {
			result += n / i;
		}
		
		System.out.println(result);
	}
}
