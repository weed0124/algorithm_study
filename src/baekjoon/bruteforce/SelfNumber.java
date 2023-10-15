package baekjoon.bruteforce;

/**
 * https://www.acmicpc.net/problem/4673
 * 셀프 넘버
 * 
 * 문제범위는 최대 10000개 이하로 모든 경우의수 체크
 * 두가지 방법으로 풀이가능
 * 1. 각 문자열로 잘라서 처리 -> 메모리 14864KB 시간 136ms
 * 2. 해당 값을 10으로 나눈 나머지값을 반복하여 처리
 */
public class SelfNumber {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		int[] result = new int[10001];
		for (int i = 1; i < 10000; i++) {
			result[i] = i;
		}
		
		for (int i = 1; i < 10000; i++) {
			char[] c = String.valueOf(i).toCharArray();
			int test = i;
			for (int j = 0; j < c.length; j++) {
				test += Character.digit(c[j], 10);
			}
			if (test < 10000) {
				result[test] = -1;
			}
		}
		
		for (int i = 1; i < 10000; i++) {
			if (result[i] != -1) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
}
