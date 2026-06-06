class Solution {
    public int maxProfit(int[] prices) {
        int by=0;  //buy
        int sl=1;  //sell
        int profit=0;
        while(sl<prices.length){
            if(prices[sl]>prices[by]){
                int maxprofit=prices[sl]-prices[by];
                profit=Math.max(maxprofit,profit);
            }else{
                //replacing by with cheaper price 
                by=sl;
            }
            sl++;
            
        }
        
        return profit;
    }
}
