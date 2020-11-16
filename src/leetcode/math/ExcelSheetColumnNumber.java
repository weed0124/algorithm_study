package leetcode.math;

/**
 * LeetCode 171. Excel Sheet Column Number
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class ExcelSheetColumnNumber {
	
	public static void main(String[] args)
	{
		ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
		escn.titleToNumber("A");
		escn.titleToNumber("AB");
		escn.titleToNumber("ZY");
	}
	
	public int titleToNumber(String s)
	{
        int positionNumber = s.length();
        int sum = 0;
        for (int i = 0; i < positionNumber; i++)
        {
            sum += Math.pow(26, positionNumber - i - 1) * (s.charAt(i) - 64);
        }
        return sum;
    }
}
