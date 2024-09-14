class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal=0, maxLen=0, currLen=0;
        for(int n:nums){
            maxVal = Math.max(maxVal,n);
        }

        for(int n:nums){
            if(n==maxVal){
                currLen++;
            }else{
                maxLen=Math.max(maxLen,currLen);
                currLen=0;
            }
        }

        maxLen=Math.max(maxLen,currLen);
        return maxLen;

    }
}