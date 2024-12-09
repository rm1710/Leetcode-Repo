class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int maxc=0;

        for(int n:nums){
            if(n == 1){
                c++;
                if(c>maxc){
                    maxc=c;
                }
            }else{
                c=0;
            }
        }
        return maxc;
    }
}