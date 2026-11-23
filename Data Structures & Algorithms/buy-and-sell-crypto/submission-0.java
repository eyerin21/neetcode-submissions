class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, n = prices.length;
        int mini = prices[0];

        for(int i=1; i<n; i++){
            int curr = prices[i] - mini;
            maxProfit = Math.max(maxProfit, curr);

            mini = Math.min(mini,prices[i]);
        }

        return maxProfit;
    }
}
