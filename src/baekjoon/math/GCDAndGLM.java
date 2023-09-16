package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2609
 * 최대공약수와 최소공배수 구하는 문제
 * 
 * 유클리드호제법을 이용하면 최대공약수를 구할 수 있고,
 * 최소공배수는 두 수를 곱한 값을 최대공약수로 나누면 구할 수 있다.
 */
public class GCDAndGLM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = gcd(a, b);
		int glm = glm(gcd, a, b);
		
		System.out.println(gcd);
		System.out.println(glm);
	}
	
	// 유클리드호제법 사용하여 재귀함수로 구현
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	
	// 최소공배수
	static int glm(int g, int a, int b) {
		return (a * b) / g;
	}
}
