package leetcode.array;

/**
 * Review
 * 1을 응용한 문제이므로 1과과 비슷한 방식으로 해결 할 수 있다.
 * 다른점은 주어진 배열에서 최대 이익이 나는 것이며
 * 최대 이익이 나기 위해서는 이익이 나는 순간 팔아야 한다.
 * 고로 Case1과 같은 수식이 나오게되며 이익이 났을때를 모두 더한 값을 반환하면 된다. 
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
