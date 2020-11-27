package leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	public static void main(String[] args)
	{
		IntersectionOfTwoArrays iot = new IntersectionOfTwoArrays();
		int[] testCase1Left = {1, 2, 2, 1};
		int[] testCase1Right = {2, 2};
		iot.intersectArrays(testCase1Left, testCase1Right);
	}
	
	/**
	 * Case 1. HashMap
	 * Runtime: 4ms
	 * Memory Usage: 39.1MB
	 */
	public int[] intersectHash(int[] nums1, int[] nums2) {
		// ù��° ���ڷ� ���� �迭�� ũ�Ⱑ Ŭ���� �������� ������� ����ó��
        if (nums1.length > nums2.length)
        {
            return intersectHash(nums2, nums1);
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
	
	/**
	 * Case 2. Array
	 * Runtime: 2ms
	 * Memory Usage: 40.4MB
	 */
	public int[] intersectArrays(int[] nums1, int[] nums2)
	{
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i = 0, j = 0, k = 0;
		
		// ���ĵ� �� �迭�� ���� ũ�⸦ ���ϰ� ������ ������ �迭 �ϳ��� �������� �����Ų��.
		while (i < nums1.length && j < nums2.length)
		{
			if (nums1[i] < nums2[j])
			{
				++i;
			}
			else if (nums1[i] > nums2[j])
			{
				++j;
			}
			else
			{
				nums1[k++] = nums1[i++];
				++j;
			}
		}
		
		// ���� �迭 �� ������ �ε��������� ī���Ͽ� ��ȯ
		return Arrays.copyOfRange(nums1, 0, k);
	}
}
