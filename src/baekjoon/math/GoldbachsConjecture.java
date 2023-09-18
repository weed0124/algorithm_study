package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/6588
 * 골드바흐의 추측
 * 
 * 문제는 풀었지만 시간제한에 걸려 성공하지는 못함
 * 시간을 줄이려니 메모리에 걸리고 현재로서는 이게 최선인듯
 */
public class GoldbachsConjecture {
	public static void main(String[] args) {
		final int MAX = 1000000; // n의 최대크기
		Scanner sc = new Scanner(System.in);
		
		List<Integer> prime = new ArrayList<Integer>();
		boolean[] check = new boolean[MAX + 1];
		check[0] = check[1] = true;
		
		// 소수를 구하여 리스트에 넣음
		for (int i = 2; i * i <= MAX; i++) {
			if (check[i] == true) {
				continue;
			}
			
			prime.add(i);
			for (int j = i * 2; j <= MAX; j += i) {
				check[j] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			for (int k = 1; k <= prime.size(); k++) {
				try {
					int p = prime.get(k);
					boolean oddNum = (n - p) % 2 != 0; // n = a + b의 형태이며 a와 b는 홀수 소수여야함 홀수체크
					
					if (oddNum && check[n - p] == false) {
						sb.append(n + " = " + p + " + " + (n - p));
						break;
					}
				} catch (IndexOutOfBoundsException e) {
					sb.append("Goldbach's conjecture is wrong.");
					break;
				}
			}
			System.out.println(sb);
			sb.setLength(0);
		}
	}
}
