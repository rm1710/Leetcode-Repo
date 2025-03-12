class Solution {
    public int maximumCount(int[] nums) {
        int c=0, c2=0;

        for(int num:nums){
            if(num>0){
                c++;
            }else if(num<0){
                c2++;
            }
        }
        return Math.max(c,c2);
    }
}