package programmers.sort;

import java.util.Arrays;

/**
 * K¹øÂ°¼ö
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class KthNumber
{
	public static void main(String[] args)
	{
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		KthNumber _this = new KthNumber();
		_this.solution(array, commands);
	}
	
	public int[] solution(int[] array, int[][] commands)
	{
		int startIdx = -1, endIdx = -1, findIdx = -1;
		int[] tempArray = {};
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++)
		{
			startIdx = commands[i][0] - 1;
			endIdx = commands[i][1];
			findIdx = commands[i][2] - 1;
			
			tempArray = Arrays.copyOfRange(array, startIdx, endIdx);
			Arrays.sort(tempArray);
			
			answer[i] = tempArray[findIdx];
		}
		return answer;
	}
}
