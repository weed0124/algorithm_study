package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/17298
 * 수열 내에서 각 원소에 대해 우측에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 구하는 문제
 */
public class RightBiggerNumber {
	
	/*
	 * 처음엔 입력값을 토대로 바로바로 다음 수와 비교하는식으로 처리하려 했으나
	 * 오큰수가 인접해있지 않는 경우 또는 없는 경우에 대해서 처리가 안되는 문제가 있어
	 * 입력값과 동일한 데이터를 임시로 저장해놓을 배열과 결과값을 출력 시켜줄 배열을 선언 후
	 * 마지막에 오큰수가 없는 값들을 -1로 치환해준 후 출력 처리
	 */
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] temp = new int[n];
		int[] result = new int[n];
		
		Stack<Integer> stk = new Stack<Integer>();
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			temp[i] = Integer.parseInt(str[i]);
		}
		
		for (int j = 0; j < n; j++) {
			if (stk.isEmpty()) {
				stk.push(j);
			}
			
			while (!stk.isEmpty() && temp[stk.peek()] < temp[j]) {
				result[stk.pop()] = temp[j];
			}
			
			stk.push(j);
		}
		
		while (!stk.empty()) {
			result[stk.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int k = 0; k < n; k++) {
			sb.append(result[k] + " ");
		}
		sb.append("\n");
		System.out.println(sb);
	}
}
