class Solution {
    public long maximumTripletValue(int[] nums) {
        int s=nums.length;
        long ans=0;

        for(int i=0;i<s;i++){
            if(nums[i]<0) return 0;
            for(int j=i+1;j<s;j++){
                int k=j+1;
                while(k!=s){
                    long a=(long)(nums[i]-nums[j])*nums[k];
                    if(a>ans){
                        ans=a;
                    }
                    k++;
                }
            }
        }

        return ans;
    }
}