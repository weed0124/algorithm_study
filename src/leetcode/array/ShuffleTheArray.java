package leetcode.array;

/**
 * LeetCode 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/
 * 
 * �־����� �迭�� ���̴� 2N
 * �迭�� �������� N�� �����ư��鼭 ������Ű�鼭 ���ο� �迭�� �־��ָ�ȴ�.
 */
public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n + i];
        }
        
        return result;
    }
}
