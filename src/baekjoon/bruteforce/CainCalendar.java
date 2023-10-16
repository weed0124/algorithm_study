package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/6064
 * 카잉 달력
 */
public class CainCalendar {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt(); // 1 <= x <= m
			int y = sc.nextInt(); // 1 <= y <= n
			
			// m 또는 n의 크기를 표현할 때 해당 값으로 나누면 0과 구분이 안되어 0 ~ n-1의 범위로 변경처리
			x -= 1;
			y -= 1;
			
			// 유효한 표현인지 체크
			boolean check = false;
			
			// 달력의 최소범위는 x, 최대범위는 n*m, x의값을 고정시켜놓고 y의 값만 찾으면 O(n2)이 아닌 O(n)처리가 됨
			// 따라서 반복 조건은 +m
			for (int i = x; i < (n * m); i += m) {
				if (i % n == y) {
					sb.append(i + 1).append("\n");
					check = true;
					// 중단안시키면 뒤에 또 다른 크기의 숫자가 나올 수 있음
					break;
				}
			}
			if (!check) {
				sb.append(-1).append("\n");
			}
		}
		System.out.println(sb);
	}
}
