class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> a=new ArrayList<>();
        int curr=0;
        for(int n:nums){
            curr=(curr*2+n)%5;
            a.add(curr%5==0);
        }
        return a;
    }
}