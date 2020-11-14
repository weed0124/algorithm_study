package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
	
	public static void main(String[] args)
	{
		ValidAnagram va = new ValidAnagram();
		System.out.println("TestCase1 : " + va.isAnagram("anagram", "nagaram"));
		System.out.println("TestCase2 : " + va.isAnagram("rat", "car"));
		System.out.println("TestCase3 : " + va.isAnagram("", ""));
		System.out.println("TestCase4 : " + va.isAnagram("a", "b"));
		System.out.println("TestCase5 : " + va.isAnagram("a", "ab"));
	}
	
	public boolean isAnagram(String s, String t)
	{
        if (s.length() != t.length())
        {
            return false;
        }
        else
        {
            Map<Character, Integer> sMap = new HashMap<>();
            Map<Character, Integer> tMap = new HashMap<>();
            
            for (char c : s.toCharArray())
            {
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            }
            
            for (char c : t.toCharArray())
            {
                tMap.put(c, tMap.getOrDefault(c, 0) + 1);
            }
            
            if (sMap.equals(tMap))
            {
           		return true;
            }
            else
            {
           		return false;
            }
        }
    }
}