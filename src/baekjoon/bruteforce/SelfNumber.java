package baekjoon.bruteforce;

/**
 * https://www.acmicpc.net/problem/4673
 * 셀프 넘버
 * 
 * 문제범위는 최대 10000개 이하로 모든 경우의수 체크
 * 두가지 방법으로 풀이가능
 * 1. 각 문자열로 잘라서 처리 -> 메모리 14728KB 시간 148ms
 * 2. 해당 값을 10으로 나눈 나머지값을 반복하여 처리 -> 메모리 13884KB 시간 116ms
 * 
 * 시간차이 및 코드 길이는 크게 안남 편한대로 처리하면 될듯
 */
public class SelfNumber {
	static boolean[] check = new boolean[10000];
	
	public static int d(int n) {
		int sum = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		/*
		// 2. 숫자를 10으로 나눈 나머지값으로 반복하여 처리
		for (int i = 1; i < 10000; i++) {
			int construct = d(i);
			if (construct < 10000) {
				check[construct] = true;
			}
			
			if (!check[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
		*/
		
		// 1. 숫자를 자리수별로 문자열로 잘라서 처리 
		for (int i = 1; i < 10000; i++) {
			char[] c = String.valueOf(i).toCharArray();
			int sum = i;
			for (int j = 0; j < c.length; j++) {
				sum += Character.digit(c[j], 10);
			}
			if (sum < 10000) {
				check[sum] = true;
			}
		}
		
		for (int i = 1; i < 10000; i++) {
			if (!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}
}
