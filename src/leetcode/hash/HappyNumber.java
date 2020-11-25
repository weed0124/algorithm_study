package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Review
 * 다른사람이 해결한 경우를 찾아봤을때 나처럼 번거롭게 문자열로 변환하고 자르는게 아닌
 * 반복문 2번으로 해결한 경우가 있었다.
 * 숫자를 각 자리수로 나눌때 1번, 해당 숫자를 체크할때 1번
 * 훨씬 간결한 코드로 메모리 및 실행속도에 차이를 볼 수 있었다.
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
	 * 0 ~ 9까지의 제곱값을 해쉬에 담고 입력한 숫자를 한자리수로 잘라 해당되는 제곱값을 더한다.
	 * 반복문에 4가 아닐때를 추가한 이유는 해당 수가 무한루프의 시발점이 되는 값이기 때문이다.
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
