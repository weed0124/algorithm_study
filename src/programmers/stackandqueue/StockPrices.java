package programmers.stackandqueue;

/**
 * 주식가격
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 */
public class StockPrices {
	
	public static void main(String[] args)
	{
		StockPrices item = new StockPrices();
		int[] testCase1 = {1, 2, 3, 2, 3};
		item.printArray(item.solution(testCase1));
	}
	
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++)
        {
        	for (int j = i + 1; j < prices.length; j++)
        	{
        		if (prices[i] <= prices[j])
        		{
        			answer[i] = j - i;
        		}
        		else
        		{
        			answer[i] = j - i;
        			break;
        		}
        	}
        }
        return answer;
    }
	
	public void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (i != array.length - 1)
			{
				System.out.print(array[i] + ", ");
			}
			else
			{
				System.out.print(array[i]);
			}
		}
		System.out.println();
	}
}
