package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Review
 * Case 1의 경우는 문자 체크를 순차와 역순으로 두번 계산하여 
 * Case 2의 경우가 훨씬 빠를거라고 생각해 풀어보았지만 실행속도는 생각보다 엄청 빠르진 않았음
 * 문자열의 길이만큼 맵에 전부넣고 유니크한 경우를 다시 찾아야되기 때문인듯하다.
 * 그래도 메모리 사용량은 거의 동일하니 더 빠른 Hash로 처리하는게 나은듯하다.
 */

/**
 * LeetCode 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacter {
	/**
	 * Case 1. Array
	 * 문자열을 각각의 문자로 잘라 해당 문자와 동일한 문자가 있는지 체크
	 * 동일한문자가 연달아 있는경우를 방지하기위해 인덱스 체크를 두번함
	 * Runtime: 28ms
	 * Memory Usage: 39.6MB
	 */
	public int firstUniqCharArray(String s) {
        int index = 0;
        while (index < s.length())
        {
            String findChar = s.substring(index, index + 1);
            int findIdx = s.lastIndexOf(findChar);
            int reverseFindIdx = s.indexOf(findChar);
            if (findIdx == index && findIdx == reverseFindIdx)
            {
                return index;
            }
            index++;
        }
        return -1;
    }
	
	/**
	 * Case 2. HashMap
	 * 맵에 문자를 담아 해당 문자의 개수를 체크
	 * Runtime: 23ms
	 * Memory Usage: 39.7MB
	 */
	public int firstUniqCharMap(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        
        // 맵에 해당 글자의 갯수를 담아넣는다.
        for (char c : s.toCharArray())
        {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        
        // 맵에 해당 글자의 갯수가 1인 것을 찾는다.
        // 위의 반복문은 index가 필요없이 속도가 빠르면 되므로 forEach를 아래 반복문은 해당 글자의 index를 찾아내야 하므로 기존의 for문을 사용
        for (int i = 0; i < s.length(); i++)
        {
            if (charMap.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
