package programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class LargestNumber {
	
	public static void main(String[] args)
	{
		LargestNumber _this = new LargestNumber();
		int[] testCase1 = {6, 10, 2};
		int[] testCase2 = {3, 30, 34, 5, 9};
		int[] testCase3 = {40, 403};
		int[] testCase4 = {40, 400};
		int[] testCase5 = {12, 121};
		int[] testCase6 = {0, 0, 0, 1000};
		int[] testCase7 = {1, 11, 111, 1111};
		int[] testCase8 = {10, 101};
		int[] testCase9 = {2,20,200};
		_this.solution(testCase1);
		_this.solution(testCase2);
		_this.solution(testCase3);
		_this.solution(testCase4);
		_this.solution(testCase5);
		_this.solution(testCase6);
		_this.solution(testCase7);
		_this.solution(testCase8);
		_this.solution(testCase9);
	}
	
	public String solution(int[] numbers) {
		String answer = "";
		String[] strNumbers = new String[numbers.length];
		for (int i = 0; i < strNumbers.length; i++)
		{
			strNumbers[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(strNumbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
		
		if (strNumbers[0].equals("0"))
		{
			return "0";
		}
		
		for (int i = 0; i < strNumbers.length; i++)
		{
			answer += strNumbers[i];
		}
		
        return answer;
    }
}
