package baekjoon.math;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/17103
 * 골드바흐 파티션
 */
public class GoldbachsPartition {
	public static void main(String[] args) {
		final int MAX = 1000000;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		boolean[] check = new boolean[MAX + 1];
		
		for (int i = 2; i <= MAX; i++) {
			if (check[i] == false) {
                primeList.add(i);
                for (int j = i * 2; j <= MAX; j += i) {
				    check[j] = true;
			    }
            }
		}
		
		int n = sc.nextInt();
		
		while (n-- > 0) {
			int num = sc.nextInt();
			int result = 0;
			
			for (int p : primeList) {
                if (num - p >= 2 && p <= (num - p)) {
					if (check[num - p] == false) {
						result += 1;
					}
				} else {
					break;
				}
			}
			System.out.println(result);
		}
	}
}
