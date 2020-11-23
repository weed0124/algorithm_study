package leetcode.array;

/**
 * LeetCode 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacter {
	/**
	 * ���ڿ��� ������ ���ڷ� �߶� �ش� ���ڿ� ������ ���ڰ� �ִ��� üũ
	 * �����ѹ��ڰ� ���޾� �ִ°�츦 �����ϱ����� �ε��� üũ�� �ι���
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
