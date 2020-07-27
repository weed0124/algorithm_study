package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 169. Majority Element
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        int result = 0;
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        
        // HashMap�� ��� ���� �� ���� ������ ��´�
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // �־����� �迭 n�� ������ ũ��(majorityCount)���� ũ�� �ش� Ű���� ��ȯ
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (majorityCount < entry.getValue()) {
                result = entry.getKey();
            }
        }
        
        return result;
    }
}
