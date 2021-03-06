package programmers.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 위장
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Disguise {
	public int solution(String[][] clothes) {
		HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
		// 경우의 수를 구하기위해 1로 선언
		int answer = 1;
		
		for (String[] cloth : clothes)
		{
			// 종류와 갯수 해당 종류가 없으면 기본값 0조정
			clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : clothesMap.entrySet())
		{
			// 경우의 수 체크 각 종류는 독립적 이므로 곱함 => *= (옷 가지수 + 안 입을 경우)
			answer *= (entry.getValue() + 1);
		}
		
		// 아무것도 안입는 경우의 수 제거
        return answer - 1;
    }
}
