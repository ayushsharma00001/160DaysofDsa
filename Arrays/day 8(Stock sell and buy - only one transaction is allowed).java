class Solution {
    public int maximumProfit(int prices[]) {
        int idx = 0;
        int maxProfit = 0;
        for(int i=1 ; i < prices.length ; i++){
            if(prices[i]-prices[idx]>0){
                maxProfit = prices[i]-prices[idx]>maxProfit?prices[i]-prices[idx]:maxProfit;
            }
            else{
                idx = i;
            }
        }
        return maxProfit;
    }
}