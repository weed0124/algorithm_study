package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/10799
 * 쇠막대기
 * 괄호 문제와 비슷한 문제로 여는 괄호와 인접한 닫는 괄호의 경우 레이저
 * 그 외의 경우 쇠막대기로 인식하여 인덱스를 체크해주면 된다
 * 결과값만을 보여주므로 println으로 처리
 */
public class IronStick {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stk.push(i);
			} else if (c == ')') {
				if (stk.pop() + 1 == i) {
					sum += stk.size();
				} else {
					sum += 1;
				}
			}
		}
		System.out.println(sum);
	}
}
