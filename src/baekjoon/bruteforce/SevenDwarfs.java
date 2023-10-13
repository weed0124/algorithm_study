package baekjoon.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2309
 * 일곱 난쟁이
 * 
 * 9명중 7명의 난쟁이를 찾아야함 -> 난쟁이가 아닌 2명을 찾으면됨
 * 배열 정렬 후 2명을 찾아 해당 인덱스를 제외한 인원 출력하고 종료 시켜주면됨
 * 종료시키지 않을 경우 해당되는 경우의 수를 다 찾으므로 시간제한에 걸림
 */
public class SevenDwarfs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 9;
		int[] a = new int[n];
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			result += a[i];
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (result - a[i] - a[j] == 100) {
					for (int k = 0; k < n; k++) {
						if (k == i || k == j) {
							continue;
						}
						System.out.println(a[k]);
					}
					System.exit(0);
				}
			}
		}
	}
}
