package leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Review
 * ������ �� ���� HashMap�� ����ϸ� �� �Ŷ� �����ؼ� HashMap�� ����� Ǯ���µ� 
 * �ٸ� ������� Ǭ �迭�� ��� ����ó�� �� ����� ���� �ӵ��� ������ �ʾҴ�.
 * �� ����� �Ǵ� �ΰ��� ��� �迭�϶� �������ϸ� ����ó���� ���� �������ϴ�.
 * �ð��� �� �� �ð����⵵ ����� �غ��� �� ��.
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
		// ù��° ���ڷ� ���� �迭�� ũ�Ⱑ Ŭ���� �������� ������� ����ó��
        if (nums1.length > nums2.length)
        {
            return intersect(nums2, nums1);
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        // ��������� ��ȯ�� �迭�� ũ�Ⱑ �󸶳� ���� �˼������Ƿ� ArrayList ����
        ArrayList<Integer> result = new ArrayList<>();
        
        // �������� �� ù��° ������ �迭���� �ʿ� ��´�.
        for (int num1 : nums1)
        {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }
        
        // ���� ����� �迭�� ���� �ʿ� �ִ��� ã�� result�� ��´�.
        for (int num2 : nums2)
        {
            int count = map.getOrDefault(num2, 0);
            if (count > 0)
            {
                result.add(num2);
                map.put(num2, count - 1);
            }
        }
        
        // �������� ���� ��� ���ϰ��� ������ �迭�̹Ƿ� �迭�� ��ȯ���ش�.
        return result.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
