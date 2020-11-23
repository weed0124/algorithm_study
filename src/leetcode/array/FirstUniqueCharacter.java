package leetcode.array;

/**
 * LeetCode 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacter {
	/**
	 * 문자열을 각각의 문자로 잘라 해당 문자와 동일한 문자가 있는지 체크
	 * 동일한문자가 연달아 있는경우를 방지하기위해 인덱스 체크를 두번함
	 */
	public int firstUniqCharArray(String s) {
        int index = 0;
        while (index < s.length())
        {
            String findChar = s.substring(index, index + 1);
            int findIdx = s.lastIndexOf(findChar);
            int reverseFindIdx = s.indexOf(findChar);
            if (findIdx == index && findIdx == reverseFindIdx)
            {
                return index;
            }
            index++;
        }
        return -1;
    }
}
