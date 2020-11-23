package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Review
 * Case 1�� ���� ���� üũ�� ������ �������� �ι� ����Ͽ� 
 * Case 2�� ��찡 �ξ� �����Ŷ�� ������ Ǯ������� ����ӵ��� �������� ��û ������ �ʾ���
 * ���ڿ��� ���̸�ŭ �ʿ� ���γְ� ����ũ�� ��츦 �ٽ� ã�ƾߵǱ� �����ε��ϴ�.
 * �׷��� �޸� ��뷮�� ���� �����ϴ� �� ���� Hash�� ó���ϴ°� �������ϴ�.
 */

/**
 * LeetCode 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacter {
	/**
	 * Case 1. Array
	 * ���ڿ��� ������ ���ڷ� �߶� �ش� ���ڿ� ������ ���ڰ� �ִ��� üũ
	 * �����ѹ��ڰ� ���޾� �ִ°�츦 �����ϱ����� �ε��� üũ�� �ι���
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
	 * �ʿ� ���ڸ� ��� �ش� ������ ������ üũ
	 * Runtime: 23ms
	 * Memory Usage: 39.7MB
	 */
	public int firstUniqCharMap(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        
        // �ʿ� �ش� ������ ������ ��Ƴִ´�.
        for (char c : s.toCharArray())
        {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        
        // �ʿ� �ش� ������ ������ 1�� ���� ã�´�.
        // ���� �ݺ����� index�� �ʿ���� �ӵ��� ������ �ǹǷ� forEach�� �Ʒ� �ݺ����� �ش� ������ index�� ã�Ƴ��� �ϹǷ� ������ for���� ���
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
