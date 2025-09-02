class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int og=x;
        int rev=0;
        while(x!=0){
            int number=x%10;
            rev=rev*10+number;
            x/=10;
        }
        return og==rev;
    }
}