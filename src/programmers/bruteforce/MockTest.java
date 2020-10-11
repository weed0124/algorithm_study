package programmers.bruteforce;

import java.util.ArrayList;

/**
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class MockTest {

	public static void main(String[] args)
	{
		MockTest _this = new MockTest();
		
//		int[] answer = {1, 2, 3, 4, 5};
		int[] answer = {1, 3, 2, 4, 2};
		_this.solution(answer);
	}
	
	public int[] solution(int[] answers)
	{
        int[] check1 = {1, 2, 3, 4, 5};
        int[] check2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] check3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] pattern1 = new int[answers.length];
        int[] pattern2 = new int[answers.length];
        int[] pattern3 = new int[answers.length];
        
        for (int index = 0; index < answers.length; index++)
        {
        	int firstIdx = index % 5;
        	int secondIdx = index % 8;
        	int thirdIdx = index % 10;
        	
        	pattern1[index] = check1[firstIdx];
        	pattern2[index] = check2[secondIdx];
        	pattern3[index] = check3[thirdIdx];
        }
        
        int right1 = 0;
        int right2 = 0;
        int right3 = 0;
        
        for (int index = 0; index < answers.length; index++)
        {
        	if (pattern1[index] == answers[index])
        	{
        		right1++;
        	}
        	if (pattern2[index] == answers[index])
        	{
        		right2++;
        	}
        	if (pattern3[index] == answers[index])
        	{
        		right3++;
        	}
        }
        
        int maxRight = Math.max(Math.max(right1, right2), right3);
        ArrayList<Integer> array = new ArrayList<Integer>();
        if (maxRight == right1)
        {
        	array.add(1);
        }
        if (maxRight == right2)
        {
        	array.add(2);
        }
        if (maxRight == right3)
        {
        	array.add(3);
        }
        
        return array.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
