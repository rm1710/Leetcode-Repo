class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    static int helper(int num, int s){
        if(num==0) return s;

        if(num%2==0) {
            return helper(num/2,s+1);
        }
        return helper(num-1,s+1);
    }
}