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
        
        // HashMap에 모든 수와 그 수의 갯수를 담는다
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // 주어지는 배열 n의 절반의 크기(majorityCount)보다 크면 해당 키값을 반환
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (majorityCount < entry.getValue()) {
                result = entry.getKey();
            }
        }
        
        return result;
    }
}
