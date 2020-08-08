package leetcode.string;

/**
 * LeetCode Week 1: August 1st - August 7th
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/
 */
public class DetectCapital {
	/**
	 * 대문자가 올바르게 쓰여있는지 확인하는 문제
	 * 문제에서 올바르게 쓰여진 경우는 세가지
	 * 1. 문자열 전체가 대문자인 경우
	 * 2. 문자열에 대문자가 없는경우
	 * 3. 문자열 첫 글자만 대문자인 경우
	 * 주어진 문자열을 charArray로 변환하여 각 문자가 대문자인지 확인 후 주어진 조건 대입
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
