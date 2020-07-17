package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 136. Single Number
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
	 public int singleNumber(int[] nums) {
		 // ��ü ���� ���� HashMap ����
	     Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
	     // ������� ��ȯ�� ���� ����
	     int result = 0;
	     for (int index = 0; index < nums.length; index++) {
	    	 // Ű���� �ش�Ǵ� ���� ������ 1�� ������ ���� + 1�� �����ش�.
	         numbersMap.put(nums[index], numbersMap.getOrDefault(nums[index], 0) + 1);
	     }
	     
	     // �Ѱ��� ���ϰ� �ִ� Ű�� ���� ���� Ȯ���ؾ� �ϹǷ� entrySet�� ���
	     for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()) {
	    	 // �ش� ���ڰ� �Ѱ��� �ִٸ� ������� Ű���� �־��ش�.
	         if (entry.getValue().equals(1)) {
	             result = entry.getKey();
	         }
	     }
	     
	     return result;
	 }
}
