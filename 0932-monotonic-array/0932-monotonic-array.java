class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean t=true, s=true;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                t=false;
            }
            if(nums[i]>nums[i-1]){
                s=false;
            }
        }

        return t || s;
    }
}