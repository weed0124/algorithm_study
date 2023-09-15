package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/17299
 * 수열 내에서 각 원소에 대해 오등큰수를 구하는 문제
 * Ai의 오등큰수는 오른쪽에 있으면서 수열 A에서 등장한 횟수보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다
 * 오등큰수가 없는 경우 -1이다
 */
public class RightBiggerNumber2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] temp = new int[n]; // 입력받은 수열을 담아놓을 임시 배열
		int[] freq = new int[1000001]; // 입력받은 수열의 빈도수를 체크할 배열(배열의 크기는 문제에서 주어진 정수의 범위보다 1이 크도록 지정해놓았음)
		int[] result = new int[n]; // 결과값 출력 배열
		
		Stack<Integer> stk = new Stack<Integer>();
		
		String[] str = br.readLine().split(" ");
		
		// 입력받은 수열을 임시 배열과 해당 수의 빈도 수를 체크해줄 배열에 넣어줌
		for (int i = 0; i < n; i++) {
			temp[i] = Integer.parseInt(str[i]);
			freq[temp[i]] += 1;
		}
		
		// 빈도수를 담아놓은 배열과 스택이 비었는지 여부를 체크해가며 값을 비교함
		for (int j = 0; j < n; j++) {
			if (stk.isEmpty()) {
				stk.push(j);
			}
			
			while (!stk.isEmpty() && freq[temp[stk.peek()]] < freq[temp[j]]) {
				result[stk.pop()] = temp[j];
			}
			stk.push(j);
		}
		
		// 스택에 남아있는 값은 오등큰수가 없는 수이므로 -1로 치환시켜준다
		while (!stk.empty()) {
			result[stk.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int k = 0; k < n; k++) {
			sb.append(result[k] + " ");
		}
		sb.append("\n");
		System.out.println(sb);
	}
}
