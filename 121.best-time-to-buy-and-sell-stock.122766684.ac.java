class Solution {
    public int maxProfit(int[] prices) {
        //We use Kadane's algorithm
        int curMax = 0, soFarMax = 0;
        for(int i = 1; i < prices.length; i++) {
            curMax = Math.max(0, curMax + prices[i] - prices[i - 1]);
            soFarMax = Math.max(soFarMax, curMax);
        }
        return soFarMax;
    }
}