class Solution {
    public int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int i=0;
        int j=1;
        int ans=0;
        
        for(int s=2;s<=n;s++){
            ans=i+j;
            i=j;
            j=ans;
        }
        return ans;
    }
}