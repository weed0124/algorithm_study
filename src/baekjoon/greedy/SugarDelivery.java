package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2839
 * 설탕 배달
 *
 * 5 또는 3으로 나누어 져야 하므로 큰 수인 5로 먼저 처리한다
 * 나누어지면 5키로 봉지 개수 + 3키로 봉지 개수로 반환
 * 나누어지지않으면 입력값에서 3키로 봉지 개수를 제한 값으로 반복하여 처리
 */
public class SugarDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        while (true) {
            if (N % 5 == 0) {
                System.out.println(N / 5 + result);
                break;
            }
            if (N < 0) {
                System.out.println(-1);
                break;
            }

            N -= 3;
            result++;
        }
    }
}
