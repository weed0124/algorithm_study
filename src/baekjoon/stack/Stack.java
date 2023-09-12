package baekjoon.stack;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10828
 * 스택
 */
public class Stack {
	
	/*
	 * JAVA 라이브러리로 주어지는 Stack이 있지만 연습 겸 배열로 구현
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		int stk[] = new int[n];
		int size = 0;
		
		while (n-- > 0) {
			String cmd = sc.next();
			if (cmd.equals("push")) {
				stk[size++] = sc.nextInt();
			} else if (cmd.equals("pop")) {
				if (size == 0) {
					bw.write(-1 + "\n");
				}
				bw.write(stk[size - 1] + "\n");
			} else if (cmd.equals("size")) {
				if (size == 0) {
					bw.write(-1 + "\n");
				} else {
					bw.write(size + "\n");
				}
			} else if (cmd.equals("empty")) {
				if (size == 0) {
					bw.write("TRUE\n");
				} else {
					bw.write("FALSE\n");
				}
			} else if (cmd.equals("top")) {
				if (size == 0) {
					bw.write(-1 + "\n");
				} else {
					bw.write(size + "\n");
				}
			}
		}
		bw.flush();
	}
}
