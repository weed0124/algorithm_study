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
		// 25는 5 * 5로 두번이나오니 추가로 세어준다.
		for (int i = 2; i <= n; i++) {
			if (i % 5 == 0) {
				result += 1;
			}
			
			if (i % 25 == 0) {
				result += 1;
			}
		}
		
		System.out.println(result);
	}
}
