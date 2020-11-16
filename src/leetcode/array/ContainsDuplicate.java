package leetcode.array;

import java.util.Arrays;

/**
 * LeetCode 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

	public static void main(String[] args)
	{
		ContainsDuplicate cd = new ContainsDuplicate();
		int[] testCase1 = {1, 2, 3, 1};
		int[] testCase2 = {1, 2, 3, 4};
		int[] testCase3 = {1, 1, 1, 3 ,3, 4, 3, 2, 4, 2};
		cd.containsDuplicate(testCase1);
		cd.containsDuplicate(testCase2);
		cd.containsDuplicate(testCase3);
	}
	
	public boolean containsDuplicate(int[] nums)
	{
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                return true;
            }
        }
        return false;
    }
}
