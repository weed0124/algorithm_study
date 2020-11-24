package leetcode.array;

import java.util.Arrays;

/**
 * Review
 * ���Ǹ� �� �����ؼ� ó���ϸ� �Ǵ� ����� ���� ��������.
 */

/**
 * LeetCode 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		/**
		 * ������ �� ã�°� ���ϹǷ� ����ó��
		 */
        Arrays.sort(nums);
        
        /**
         * n == nums.length�̹Ƿ� 
         * ������ �ε����� �ش�Ǵ°��� ���̰� ���� ������ �ش� ���� ���°��̹Ƿ� ��ȯ
         */
        if (nums[nums.length - 1] != nums.length)
        {
            return nums.length;
        }
        
        /**
         * ��� ���� 0���� �����ϰ� ���������Ƿ� 0�� �ε����� 0�̾���Ѵ�.
         */
        if (nums[0] != 0)
        {
            return 0;
        }
        
        /**
         * 1���� ���� - 1������ ���� ���ϸ� �ش� �ε����� ���� ���������� �ش� ���� �����Ƿ� ��ȯ
         */
        for (int i = 1; i < nums.length; i++)
        {
            if (i != nums[i])
            {
                return i;
            }
        }
        
        /**
         * �迭���� ã�� �������Ƿ� -1�� ��ȯó��
         */
        return -1;
    }
}
