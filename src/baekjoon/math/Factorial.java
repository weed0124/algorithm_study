package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10872
 * 팩토리얼
 */
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		
		System.out.println(result);
	}
}
