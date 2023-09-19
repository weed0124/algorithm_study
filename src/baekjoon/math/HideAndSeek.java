package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/17087
 * 숨바꼭질6
 * 
 * 수빈이는 위치가 X일때 X+D, X-D만 움직일 수 있으므로
 * 각 동생과의 거리차이를 구하고 거리차이간의 최대공약수를 구하면 된다.
 */
public class HideAndSeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Math.abs(s - sc.nextInt());
		}
		
		int result = arr[0];
		
		for (int i = 1; i < n; i++) {
			result = gcd(result, arr[i]);
		}
		
		System.out.println(result);
	}
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
