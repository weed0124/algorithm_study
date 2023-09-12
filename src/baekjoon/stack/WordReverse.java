package baekjoon.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/9093
 * 단어 뒤집기
 */
public class WordReverse {
	
	/*
	 * 스택은 FILO(First In Last Out)으로 입력과 출력이 반대일 경우 스택에 넣고 빼기만해도 원하는 결과가 나오므로
	 * 문제에서 단어를 구분짓는 개행과 공백을 제외한 문자가 입력될 경우 스택에 넣고 반대의 경우 출력시킨다. 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			String word = br.readLine() + "\n";
			Stack<Character> stk = new Stack<>();
			for (char c : word.toCharArray()) {
				if (c == '\n' || c == ' ') {
					while (!stk.isEmpty()) {
						bw.write(stk.pop());
					}
					bw.write(c);
				} else {
					stk.push(c);
				}
			}
		}
		bw.flush();
	}
}
