package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1931
 * 회의실 배정
 *
 * 종료시각으로 정렬 후 동일할경우 시작시각으로 정렬하여 비교
 * compare 오버라이딩하여 위와 같은 조건으로 처리
 * 이전 종료시각과 현재 시작시각을 비교하여 큰 경우 회의 참석가능으로 회의 개수 증가
 */
public class MeetingRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];
        StringTokenizer st;

        for (int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int result = 0;
        int prevEndTime = 0;
        for (int i = 0; i < N; i++) {
            if (prevEndTime <= time[i][0]) {
                prevEndTime = time[i][1];
                result++;
            }
        }

        System.out.println(result);
    }
}
