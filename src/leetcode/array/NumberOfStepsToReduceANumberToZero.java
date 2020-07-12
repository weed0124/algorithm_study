package leetcode.array;

/**
 * LeetCode 1342. Number of Steps to Reduce a Number to Zero.
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NumberOfStepsToReduceANumberToZero {
	public int numberOfSteps (int num) {
        int result = 0;
        while (num != 0) {
            if (num % 2 == 0) {
            	// ¦���϶��� 2�� ������
                num = num / 2;
                ++result;
            } else if (num % 2 == 1) {
            	// Ȧ���϶��� 1 ����
                num -= 1;
                ++result;
            }
        }
        return result;
    }
}
