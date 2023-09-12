package baekjoon.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 괄호 문자열이 주어졌을때 올바른 괄호 문자열인지 체크하는 문제
 * https://www.acmicpc.net/problem/9012
 */
public class Parenthesis {
	public static String isValid(String data) {
		Stack<Character> stk = new Stack<Character>();
		try {
			for (char c : data.toCharArray()) {
				if (c == '(') {
					stk.push(c);
				} else {
					stk.pop();
				}
			}
		} catch (EmptyStackException e) {
			return "NO\n";
		}
		
		if (stk.isEmpty()) {
			return "YES\n";
		} else {
			return "NO\n";
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			String str = br.readLine();
			bw.write(isValid(str));
		}
		bw.flush();
	}
}
