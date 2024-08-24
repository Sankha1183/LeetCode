class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int mprofit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-mini;
            mprofit=Math.max(mprofit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return mprofit;
    }
}