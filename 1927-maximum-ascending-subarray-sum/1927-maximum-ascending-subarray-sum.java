class Solution {
    public int maxAscendingSum(int[] nums) {
        int curSum=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i] > nums[i - 1]){
                curSum+=nums[i];
            } else {
                ans = Math.max(ans,curSum);
                curSum = nums[i];
            }
        }
        ans=Math.max(ans,curSum);
        return ans;
    }
}