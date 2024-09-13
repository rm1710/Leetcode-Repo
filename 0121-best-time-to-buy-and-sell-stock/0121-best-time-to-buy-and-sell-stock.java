class Solution {
    public int maxProfit(int[] prices) {
        int sell1=0;
        int hold1=Integer.MIN_VALUE;

        for(int p:prices){
            sell1=Math.max(sell1,hold1+p);
            hold1=Math.max(hold1,-p);
        }

        return sell1;
    }
}