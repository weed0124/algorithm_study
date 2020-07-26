package leetcode.string;

/**
 * LeetCode 344. Reverse String
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
	public void reverseString(char[] s) {
		// 주어지는 문자열의 절반 길이만큼만 반복문
        for (int i = 0; i < s.length / 2; i++) {
        	// 임시로 담아놓을 변수 선언
            char temp = s[i];
            // 배열의 시작과 끝부분에 대칭되는 인덱스 부분을 바꿔준다.
            s[i] = s[(s.length - 1) - i];
            s[(s.length - 1) - i] = temp;
        }
    }
}
