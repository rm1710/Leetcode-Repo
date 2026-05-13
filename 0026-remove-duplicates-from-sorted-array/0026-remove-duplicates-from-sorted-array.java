class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        int count=1;
        while(count<nums.length){
            if(nums[count]==nums[count-1]){
                count++;
                continue;
            }

            c++;
            nums[c]=nums[count];
            count++;
        }
        return c+1;
    }
}