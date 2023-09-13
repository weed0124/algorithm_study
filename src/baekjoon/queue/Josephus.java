package baekjoon.queue;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1158
 * 요세푸스 문제
 * 
 * 결과 출력 시 데이터 가공이 필요하여 StringBuilder 사용
 * N명의 인원과 K번째 순서대로 제거하려면 
 * 큐는 선입선출로 빼고 다시 넣을 경우 제일 처음의 인원이 맨뒤로 가게 되기 때문에
 * K번째가 되기 전의 인원은 기준이 되는 큐에 빼고 다시 넣고 K번째의 경우 빼기만 하면 된다.
 * 위와 같은 기준으로 결과값을 가공하여 출력하면 됨
 */
public class Josephus {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		
		int size = sc.nextInt();
		int count = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		for (int i = 1; i <= size; i++) {
			q.offer(i);
		}

		int n = 1;
		while (!q.isEmpty()) {
			if (n != count) {
				q.offer(q.poll());
				n++;
			} else {
				int m = q.poll();
				if (!q.isEmpty()) {
					sb.append(m + ", ");
				} else {
					sb.append(m);
				}
				n = 1;
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}
