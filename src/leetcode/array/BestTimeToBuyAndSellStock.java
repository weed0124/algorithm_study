package leetcode.array;

/**
 * Review
 * ������ ���� �������µ��� ó���� ����� Case 1�̴�.
 * Case 1�� ó���� ��� ���� ���ϰ� �ݺ����� �������� ���� ������ ���ʿ��ϰ� �ݺ��Ǵ� �κ��� ����.
 * �� �κ��� �����ϰ��� �ݺ����� �ѹ��� ����ؼ� ó���ϰ��� �� ����� Case2�̴�.
 * ���� �ð��� �������Ŷ� ������ ������ �ξ� ��������.
 */

/**
 * LeetCode 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
	/**
	 * Case 1. Brute Force
	 * �ݺ��� 2���� ����Ͽ� �� �� ���� ū ������ ���� ������ ����
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
	 * �ݺ����� �Ѱ��� ���̰� ���� ū ������ ���� ���� ã���� ó��
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
