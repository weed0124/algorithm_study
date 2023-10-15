package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1107
 * 리모컨
 * 
 * 고장난 숫자를 제외한 가장 근접한 채널을구하고 + 또는 -버튼만으로 갈 수 있는 값을 구해야한다
 * 주어진 채널의 범위는 0 <= N <= 500000으로 50만번 체크하면 될것 같지만
 * 주어진 채널 : 500000, 고장난 숫자 : 0,1,2,3,4,5,6,7,8 일 때 999999 - 500000 = 499999번이 최소 채널이 될 수 있음
 * 고로 + 50만번 또는 - 50만번을 누를 수 있는 채널이 구해질 수 있는 채널의 최대범위이므로 0부터 100만까지의 채널의 경우를 체크해야함
 * 문제에서 주어진 초기 채널은 100번이고 -채널은 없으므로 초기값을 잘 지정해놓고 풀어야함  
 */
public class RemoteControl {
	static boolean[] broken = new boolean[10];
	
	public static int check(int n) {
		// 아래의 반복문으로 0은 처리가 안되어 별도의 예외처리
		if (n == 0) {
			return broken[0] ? 0 : 1;
		}
		
		int result = 0;
		
		while (n > 0) {
			// 10으로 나눈 나머지값이 있는 경우 고장난 숫자이므로 숫자버튼만으로 해결 불가
			if (broken[n % 10]) {
				return 0;
			}
			result++;
			n /= 10;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			broken[sc.nextInt()] = true;
		}
		
		// 초기채널은 100이므로 빼줘야함
		int result = n - 100; 
		
		// -채널은 없고, 고장난 숫자에 따라 n - 100을 뺀 만큼의 + 또는 -로 이동할 수 있으므로 양수처리
		if (result < 0) { 
			result = -result;
		}
		
		for (int i = 0; i < 1000000; i++) {
			int length = check(i); // 고장난 숫자 버튼이 있는지 없으면 숫자를 누르는 횟수 체크
			if (length > 0) {
				int press = n - i; // 주어진값 - 숫자누르는횟수 = + 또는 -누르는 횟수 
				if (press < 0) {
					press = -press;
				}
				
				if (result > length + press) {
					result = length + press;
				}
			}
		}
		System.out.println(result);
	}
}
