package baekjoon.math;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9613
 * GCD 합
 */
public class GCDSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n-- > 0) {
			long sum = 0;
			
			int m = sc.nextInt();
			int[] arr = new int[m];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < m - 1; i++) {
				for (int j = i + 1; j < m; j++) {
					sum += gcd(arr[i], arr[j]);
				}
			}
			
			System.out.println(sum);
		}
		
	}
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
