package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/13305
 * 주유소
 *
 * 좌측 도시부터 우측 도시로 내림차순이 되도록 하여 최소한의 기름을 넣도록 구하면 된다.
 * ex) 도로 2 3 1
 * 주유비 5 2 4 1 -> 5 2 2 1
 * 위의 경우 두번째 도시에서 주유하는게 세번째 도시보다 저렴하므로 세번째 도시를 두번째 도시와 동일하게 치환한다.
 * 주유비 * 도로해서 더하면 최소비용
 */
public class FillingStation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] roads = new int[N - 1];
        int[] prices = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < roads.length; i++) {
            roads[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        int prevPrice = prices[0];
        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            if (prevPrice < prices[i]) {
                prices[i] = prevPrice;
            } else {
                prevPrice = prices[i];
            }

            result += prices[i] * roads[i];
        }

        System.out.println("result = " + result);
    }
}
