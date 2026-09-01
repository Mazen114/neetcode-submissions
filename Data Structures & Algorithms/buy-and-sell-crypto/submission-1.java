class Solution {
    public int maxProfit(int[] prices) {
        int minPriceSoFar = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPriceSoFar) {
                minPriceSoFar = prices[i];
            } else if (prices[i] - minPriceSoFar > maxProfit) {
                maxProfit = prices[i] - minPriceSoFar;
            }
        }
        
        return maxProfit;
    }
}