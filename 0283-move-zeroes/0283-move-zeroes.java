class Solution {
    public void moveZeroes(int[] nums) {
        int non0Ind=0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[non0Ind++]=nums[i];
            }
        }

        while(non0Ind<nums.length){
            nums[non0Ind++]=0;
        }
    }
}