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
