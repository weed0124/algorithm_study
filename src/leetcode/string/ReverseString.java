package leetcode.string;

/**
 * LeetCode 344. Reverse String
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
	public void reverseString(char[] s) {
		// �־����� ���ڿ��� ���� ���̸�ŭ�� �ݺ���
        for (int i = 0; i < s.length / 2; i++) {
        	// �ӽ÷� ��Ƴ��� ���� ����
            char temp = s[i];
            // �迭�� ���۰� ���κп� ��Ī�Ǵ� �ε��� �κ��� �ٲ��ش�.
            s[i] = s[(s.length - 1) - i];
            s[(s.length - 1) - i] = temp;
        }
    }
}
