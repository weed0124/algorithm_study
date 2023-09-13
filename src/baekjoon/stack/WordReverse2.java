package baekjoon.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/17413
 * 단어뒤집기2
 * 기존 단어 뒤집기에서 태그 안의 문자열은 기존과 동일하게 출력이 추가됨
 * 태그인지 아닌지 구분할 변수와 문자열 조건을 확인 하여 그대로 출력 그 외에 문자열은 기존 뒤집기와 동일하게 스택에 넣고 빼도록 처리
 */
public class WordReverse2 {

	static void print(BufferedWriter b, Stack<Character> s) throws IOException {
		while (!s.isEmpty()) {
			b.write(s.pop());
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		Stack<Character> stk = new Stack<Character>();
		
		boolean tag = false;

		for (char c : str.toCharArray()) {
			if (c == '<') {
				print(bw, stk);
				tag = true;
				bw.write(c);
			} else if (c == '>') {
				tag = false;
				bw.write(c);
			} else if (tag) {
				bw.write(c);
			} else {
				if (c == ' ') {
					print(bw, stk);
					bw.write(c);
				} else {
					stk.push(c);
				}
			}
		}
		print(bw, stk);
		bw.write("\n");
		bw.flush();
	}
}
