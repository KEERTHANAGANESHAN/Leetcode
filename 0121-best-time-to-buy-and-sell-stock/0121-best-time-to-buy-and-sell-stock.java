class Solution {
    public int maxProfit(int[] prices) {
        int m = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < m) {
                m = prices[i];
            }
            if (prices[i] - m > profit) {
                profit = prices[i] - m;
            }
        }
        return profit;
    }
}