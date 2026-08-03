class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int n = prices.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(prices[j]>prices[i])
                {
                    int profit = prices[j]-prices[i];
                    max_profit = Math.max(profit,max_profit);
                }
            }
        }
        return max_profit;
    }
}
