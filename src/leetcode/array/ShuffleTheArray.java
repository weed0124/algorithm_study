package leetcode.array;

/**
 * LeetCode 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/
 * 
 * 주어지는 배열의 길이는 2N
 * 배열의 시작점과 N을 번갈아가면서 증가시키면서 새로운 배열에 넣어주면된다.
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
