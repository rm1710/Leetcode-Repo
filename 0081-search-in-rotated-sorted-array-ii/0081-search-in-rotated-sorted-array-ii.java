class Solution {
    public boolean search(int[] nums, int target) {
        boolean s=false;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==target){
                s=true;
            }
        }
        return s;
    }
}