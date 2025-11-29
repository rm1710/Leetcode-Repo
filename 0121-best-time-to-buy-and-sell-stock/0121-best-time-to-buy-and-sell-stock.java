class Solution {
    public int maxProfit(int[] prices) {
        int pro=Integer.MAX_VALUE;
        int maxPro=0;

        for(int p:prices){
            if(p<pro){
                pro=p;
            }else{
                maxPro=Math.max(maxPro,p-pro);
            }
        }
        return maxPro;
    }
}