class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit=0;
        int minPrice=Integer.MIN_VALUE;

        for(int p:prices){
            MaxProfit=Math.max(MaxProfit,minPrice+p);
            minPrice=Math.max(minPrice,-p);
        }

        return MaxProfit;
    }
}