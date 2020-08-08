package leetcode.string;

/**
 * LeetCode Week 1: August 1st - August 7th
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/
 */
public class DetectCapital {
	/**
	 * �빮�ڰ� �ùٸ��� �����ִ��� Ȯ���ϴ� ����
	 * �������� �ùٸ��� ������ ���� ������
	 * 1. ���ڿ� ��ü�� �빮���� ���
	 * 2. ���ڿ��� �빮�ڰ� ���°��
	 * 3. ���ڿ� ù ���ڸ� �빮���� ���
	 * �־��� ���ڿ��� charArray�� ��ȯ�Ͽ� �� ���ڰ� �빮������ Ȯ�� �� �־��� ���� ����
	 */
	public boolean detectCapitalUse(String word) {
		int upperCharCount = 0;
		for (char ch : word.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				upperCharCount++;
			}
		}
		
		return upperCharCount == 0 || upperCharCount == word.length() || (upperCharCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
