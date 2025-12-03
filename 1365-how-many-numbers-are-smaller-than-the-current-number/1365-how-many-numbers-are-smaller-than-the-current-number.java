class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[j]<curr){
                    c++;
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}