package baekjoon.dynamic;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11054
 * 가장 큰 바이토닉 부분 수열(Biggest Bitonic Increasing Subsequence)
 * 
 * 수가 증가되었다가 감소되야 함
 * LIS로 가장 긴 길이를 구하고 LDS의 길이를 구해서 더하면 되고 
 * i번째에서 끝나는 수열과 시작되는 수열로 i가 중복이 되기 때문에 1을 빼줘야함
 */
public class BBIS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n], di = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			di[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && di[i] < di[j] + 1) {
					di[i] = di[j] + 1;
				}
			}
		}
		
		int[] dd = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			dd[i] = 1;
			for (int j = i; j < n; j++) {
				if (a[j] < a[i] && dd[i] < dd[j] + 1) {
					dd[i] = dd[j] + 1;
				}
			}
		}
		
		int result = di[0] + dd[0] - 1;
		for (int i = 1; i < n; i++) {
			if (result < di[i] + dd[i] - 1) {
				result = di[i] + dd[i] - 1;
			}
		}
		
		System.out.println(result);
	}
}
