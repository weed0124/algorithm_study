package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/10845
 * 배열로 큐 구현
 * 시간 제한 및 정수의 크기가 커서인지 입출력 처리에 따라 불가한 경우가 있음
 * 입력이 많아 Scanner 사용 시 통과가 안되는 문제가 있어 BufferedReader 사용
 * 출력에는 문제가 없어 println을 사용하였음
 */
public class Queue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] queue = new int[n];
		int begin = 0, end = 0;
		
		while (n-- > 0) {
			String[] str = br.readLine().split(" ");
			String cmd = str[0];
			
			if (cmd.equals("push")) {
				int num = Integer.parseInt(str[1]);
				queue[end++] = num;
			} else if (cmd.equals("pop")) {
				if (begin == end) {
                    System.out.println(-1);
				} else {
                    System.out.println(queue[begin++]);
				}
			} else if (cmd.equals("size")) {
                System.out.println(end - begin);
			} else if (cmd.equals("empty")) {
                if (begin == end) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
			} else if (cmd.equals("front")) {
                if (begin == end) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[begin]);
                }
			} else if (cmd.equals("back")) {
                if (begin == end) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[end - 1]);
                }
			}
		}
	}
}
