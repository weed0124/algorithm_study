package programmers.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class AnUncompletedPlayer {
	public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantsMap = new HashMap<String, Integer>();

        for (String pt : participant) {
            participantsMap.put(pt, participantsMap.getOrDefault(pt, 0) + 1);
        }

        for (String cmp : completion) {
            participantsMap.put(cmp, participantsMap.get(cmp) + 1);
        }

        for (Map.Entry<String, Integer> entry : participantsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return null;
    }
}
