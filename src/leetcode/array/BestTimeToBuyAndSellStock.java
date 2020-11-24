package leetcode.array;

/**
 * Review
 * 문제를 보고 떠오르는데로 처리한 결과가 Case 1이다.
 * Case 1로 처리한 결과 값을 비교하고 반복문을 이중으로 돌기 때문에 불필요하게 반복되는 부분이 많다.
 * 그 부분을 보완하고자 반복문을 한번만 사용해서 처리하고자 한 결과가 Case2이다.
 * 실행 시간이 빨라질거라 예상은 했지만 훨씬 빨라졌다.
 */

/**
 * LeetCode 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
	/**
	 * Case 1. Brute Force
	 * 반복문 2개를 사용하여 비교 후 가장 큰 이익이 나는 값으로 변경
	 * Runtime: 265ms
	 * Memory Usage: 38.9MB
	 */
	public int maxProfitBruteForce(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++)
        {
            for (int j = i + 1; j < prices.length; j++)
            {
                if (prices[i] < prices[j])
                {
                    if (prices[j] - prices[i] > result)
                    {
                        result = prices[j] - prices[i];
                    }
                }
            }
        }
        return result;
    }
	
	/**
	 * Case 2.
	 * 반복문을 한개로 줄이고 가장 큰 이익이 나는 값을 찾도록 처리
	 * Runtime: 1ms
	 * Memory Usage: 38.9MB
	 */
	public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices)
        {
            if (price < minPrice)
            {
                minPrice = price;
            }
            else if (price - minPrice > maxProfit)
            {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
