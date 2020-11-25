package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Review
 * �ٸ������ �ذ��� ��츦 ã�ƺ����� ��ó�� ���ŷӰ� ���ڿ��� ��ȯ�ϰ� �ڸ��°� �ƴ�
 * �ݺ��� 2������ �ذ��� ��찡 �־���.
 * ���ڸ� �� �ڸ����� ������ 1��, �ش� ���ڸ� üũ�Ҷ� 1��
 * �ξ� ������ �ڵ�� �޸� �� ����ӵ��� ���̸� �� �� �־���.
 */

/**
 * LeetCode 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 * Runtime: 1ms
 * Memory Usage: 36.2MB
 */
public class HappyNumber {
	/**
	 * Case 1. Hash
	 * 0 ~ 9������ �������� �ؽ��� ��� �Է��� ���ڸ� ���ڸ����� �߶� �ش�Ǵ� �������� ���Ѵ�.
	 * �ݺ����� 4�� �ƴҶ��� �߰��� ������ �ش� ���� ���ѷ����� �ù����� �Ǵ� ���̱� �����̴�.
	 */
	public boolean isHappy(int n) {
        Map<Character, Integer> digitMap = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            digitMap.put(Character.forDigit(i, 10), (int) Math.pow(i, 2));
        }
        String convertStringN = String.valueOf(n);
        int result = n;
        while (result != 1 && result != 4)
        {
            result = 0;
            for (int i = 0; i < convertStringN.length(); i++)
            {
                result += digitMap.get(convertStringN.charAt(i));
            }
            if (result == 1)
            {
                break;
            }
            convertStringN = String.valueOf(result);
        }
        return result == 1 ? true : false;
    }
}
