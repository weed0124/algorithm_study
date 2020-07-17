package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 136. Single Number
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
	 public int singleNumber(int[] nums) {
		 // 전체 수를 담을 HashMap 선언
	     Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
	     // 결과값을 반환할 변수 선언
	     int result = 0;
	     for (int index = 0; index < nums.length; index++) {
	    	 // 키값에 해당되는 값이 없으면 1을 있으면 값에 + 1을 더해준다.
	         numbersMap.put(nums[index], numbersMap.getOrDefault(nums[index], 0) + 1);
	     }
	     
	     // 한개만 지니고 있는 키와 값을 전부 확인해야 하므로 entrySet을 사용
	     for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()) {
	    	 // 해당 숫자가 한개만 있다면 결과값에 키값을 넣어준다.
	         if (entry.getValue().equals(1)) {
	             result = entry.getKey();
	         }
	     }
	     
	     return result;
	 }
}
