package leetcode.array;

/**
 * Review
 * 1�� ������ �����̹Ƿ� 1���� ����� ������� �ذ� �� �� �ִ�.
 * �ٸ����� �־��� �迭���� �ִ� ������ ���� ���̸�
 * �ִ� ������ ���� ���ؼ��� ������ ���� ���� �Ⱦƾ� �Ѵ�.
 * ��� Case1�� ���� ������ �����ԵǸ� ������ �������� ��� ���� ���� ��ȯ�ϸ� �ȴ�. 
 */

/**
 * LeetCode 122. Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockII {
	/**
	 * Case 1. Array
	 * Runtime: 1ms
	 * Memory Usage: 38.6MB
	 */
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
	    for (int i = 1; i < prices.length; i++)
	    {
	        if (prices[i - 1] < prices[i])
	        {
	            maxProfit += prices[i] - prices[i - 1];
	        }
	    }
	    return maxProfit;
	}
}
