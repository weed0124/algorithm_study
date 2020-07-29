package leetcode.array;

/**
 * LeetCode 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        // 0은 배열의 맨뒤로
        // 0이 아닌수는 그대로
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
