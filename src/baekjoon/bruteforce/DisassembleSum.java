package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2231
 * 분해합
 * 
 * 가장 작은 생성자를 구해야 하므로 1부터 N까지 순차적으로 생성자를 구해서 처리하면 됨
 */
public class DisassembleSum {
	public static int constructor(int n) {
		int sum = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		for (int i = 1; i < n; i++) {
			if (constructor(i) == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
