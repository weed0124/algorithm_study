package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1476
 * 1 <= E <= 15
 * 1 <= S <= 28
 * 1 <= M <= 19
 * 
 * 최대 값은 15*28*19 = 7980으로 모든 경우의수 처리
 */
public class DayCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int e = 1, s = 1, m = 1;
		
		for (int i = 1;; i++) {
			if (E == e && S == s && M == m) {
				System.out.println(i);
				break;
			}
			
			e++;
			s++;
			m++;
			
			if (e > 15) {
				e = 1;
			}
			
			if (s > 28) {
				s = 1;
			}
			
			if (m > 19) {
				m = 1;
			}
		}
	}
}
