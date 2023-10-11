package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/13398
 * 연속합2
 * 
 * 문제의 조건은 수를 1개 제거 할 수 있고, 하지 않아도 된다.
 * 제거하지 않을경우는 기존의 연속합과 동일하게 처리
 * i번째 수를 제거한다고 했을때 i - 1까지의 수열과 i + 1까지의 수열의 합이 가장 큰 것을 찾으면 된다.
 */
public class ContinuitySum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n], di = new int[n], dd = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			di[i] = a[i];
			if (i > 0 && di[i] < di[i - 1] + a[i]) {
				di[i] = di[i - 1] + a[i];
			}
		}
		
		for (int i = n - 1; i >= 0; i--) {
			dd[i] = a[i];
			if (i < n - 1 && dd[i] < dd[i + 1] + a[i]) {
				dd[i] = dd[i + 1] + a[i];
			}
		}
		
		int result = di[0];
		for (int i = 1; i < n; i++) {
			if (result < di[i]) {
				result = di[i];
			}
		}
		
		for (int i = 1; i < n - 1; i++) {
			if (result < di[i - 1] + dd[i + 1]) {
				result = di[i - 1] + dd[i + 1];
			}
		}
		System.out.println(result);
	}
}
