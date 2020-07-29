package leetcode.array;

/**
 * LeetCode 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        // 0�� �迭�� �ǵڷ�
        // 0�� �ƴѼ��� �״��
        int notZeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[notZeroIdx++] = nums[i];
            }
        }
        
        for (int j = notZeroIdx; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
