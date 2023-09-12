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
	
	/*
	 * 괄호가 잘못되는 경우는 아래와 같이
	 * 1. ( 가 많은 경우
	 * 2. ) 가 많은 경우 
	 * 두 가지로 분류가 되고 개수만 체크해서 기준을 정해 더하고 빼면 되지만 스택을 사용하라고 하였으니
	 * 한가지 문자를 정하여 해당 문자가 나올 경우 Stack에 넣고 반대의 경우 뺀다.
	 * 
	 * 위 두가지 경우에 대해서 고려해야할 사항이 다르므로 두가지 및 예외사항에 대한 처리를 해줌
	 */
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
