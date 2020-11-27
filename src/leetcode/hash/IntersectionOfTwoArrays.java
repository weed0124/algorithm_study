package leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Review
 * 문제를 본 순간 HashMap을 사용하면 될 거라 생각해서 HashMap을 사용해 풀었는데 
 * 다른 사람들이 푼 배열에 담아 정렬처리 한 방법에 비해 속도가 나오지 않았다.
 * 비교 대상이 되는 두개가 모두 배열일때 어지간하면 정렬처리가 제일 빠른듯하다.
 * 시간이 될 때 시간복잡도 계산을 해봐야 할 듯.
 */

/**
 * LeetCode 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectionOfTwoArrays {
	/**
	 * Case 1. HashMap
	 * Runtime: 4ms
	 * Memory Usage: 39.1MB
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
		// 첫번째 인자로 들어온 배열의 크기가 클때를 기준으로 잡기위해 변경처리
        if (nums1.length > nums2.length)
        {
            return intersect(nums2, nums1);
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        // 결과값으로 반환할 배열의 크기가 얼마나 될지 알수없으므로 ArrayList 선언
        ArrayList<Integer> result = new ArrayList<>();
        
        // 기준점이 될 첫번째 인자의 배열값을 맵에 담는다.
        for (int num1 : nums1)
        {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }
        
        // 비교할 대상의 배열의 값이 맵에 있는지 찾아 result에 담는다.
        for (int num2 : nums2)
        {
            int count = map.getOrDefault(num2, 0);
            if (count > 0)
            {
                result.add(num2);
                map.put(num2, count - 1);
            }
        }
        
        // 문제에서 원한 결과 리턴값은 정수형 배열이므로 배열로 변환해준다.
        return result.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
