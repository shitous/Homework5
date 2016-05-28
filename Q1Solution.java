public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int[] sell = new int[prices.length]; //max profit for that day if stock sold
        int[] buy = new int[prices.length]; //max profit for that day if stock bought or do nothing
        
        
        sell[0] = 0;         // max profit @ the first day if sell
        buy[0] = -prices[0]; // max profit @ the first day if buy.
        
        for (int i = 1; i < prices.length; i++) {
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
            if (i >= 2) {
                buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
            }
            else {
                buy[i] = Math.max(buy[i - 1], -prices[i]);
            }
        }
        return sell[prices.length - 1];
    }
}