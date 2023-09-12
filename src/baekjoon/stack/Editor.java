package baekjoon.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * 에디터 구현 문제
 * https://www.acmicpc.net/problem/1406
 */
public class Editor {
	
	/*
	 * 배열로도 풀 수 있으나 해당 문제의 경우 시간제한과 주어진 정수의 범위가 넓으므로
	 * 스택의 사용이 필요함
	 * 
	 * 커서를 기준으로 좌/우측 두개의 스택으로 나누어 현재 커서 위치를 처리하고,
	 * 결과 출력을 위해 마지막에 두개의 스택을 합친 후 출력 처리함.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		for (char c : word.toCharArray()) {
			left.push(c);
		}
		
		while (n-- > 0) {
			String[] str = br.readLine().split(" ");
			char cmd = str[0].charAt(0);
			
			if (cmd == 'L') {
				if (!left.isEmpty()) {
					right.push(left.pop());
				}
			} else if (cmd == 'D') {
				if (!right.isEmpty()) {
					left.push(right.pop());
				}
			} else if (cmd == 'B') {
				if (!left.isEmpty()) {
					left.pop();
				}
			} else if (cmd == 'P') {
				left.push(str[1].charAt(0));
			}
		}
		
		while (!left.isEmpty()) {
			right.push(left.pop());
		}
		
		while (!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.flush();
	}
}
