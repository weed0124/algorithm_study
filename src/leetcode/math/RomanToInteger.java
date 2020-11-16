package leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

	public static void main(String[] args)
	{
		RomanToInteger rti = new RomanToInteger();
		rti.romanToInt("III");
		rti.romanToInt("IV");
		rti.romanToInt("IX");
		rti.romanToInt("LVIII");
		rti.romanToInt("MCMXCIV");
	}
	
	public int romanToInt(String s)
	{
		Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);
        
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int currentVal = romanMap.get(s.charAt(i));
            int nextIdx = i + 1;
            int nextVal = romanMap.get(s.charAt(s.length() <= nextIdx ? s.length() - 1 : nextIdx));
            
            if (currentVal < nextVal)
            {
                sum += (nextVal - currentVal);
                i += 1;
            }
            else
            {
                sum += currentVal;
            }
        }
        return sum;
	}
}
