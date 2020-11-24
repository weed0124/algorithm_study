package leetcode.array;

import java.util.Arrays;

/**
 * Review
 * 조건만 잘 정리해서 처리하면 되는 어렵지 않은 문제였다.
 */

/**
 * LeetCode 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		/**
		 * 정렬한 후 찾는게 편하므로 정렬처리
		 */
        Arrays.sort(nums);
        
        /**
         * n == nums.length이므로 
         * 마지막 인덱스에 해당되는값과 길이가 같지 않으면 해당 값이 없는것이므로 반환
         */
        if (nums[nums.length - 1] != nums.length)
        {
            return nums.length;
        }
        
        /**
         * 모든 값은 0부터 시작하고 정렬했으므로 0번 인덱스는 0이어야한다.
         */
        if (nums[0] != 0)
        {
            return 0;
        }
        
        /**
         * 1부터 길이 - 1까지의 값을 비교하며 해당 인덱스와 값이 같지않으면 해당 값이 없으므로 반환
         */
        for (int i = 1; i < nums.length; i++)
        {
            if (i != nums[i])
            {
                return i;
            }
        }
        
        /**
         * 배열에서 찾지 못했으므로 -1을 반환처리
         */
        return -1;
    }
}
