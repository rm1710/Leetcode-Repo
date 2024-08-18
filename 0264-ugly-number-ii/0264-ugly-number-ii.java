class Ugly{
    private static final int LIMIT=1690;
    public int[] nums=new int[LIMIT];

    Ugly(){
        nums[0]=1;
        int ugly,index2=0, index3 = 0, index5 = 0;

        for(int i=1;i<LIMIT;i++){
            ugly=Math.min(Math.min(nums[index2]*2,nums[index3]*3),nums[index5]*5);
            nums[i]=ugly;
            if(ugly==nums[index2]*2)
                ++index2;
            if(ugly==nums[index3]*3)
                ++index3;
            if(ugly==nums[index5]*5)
                ++index5;
        }
    }
}

class Solution {
    public static Ugly ugly= new Ugly();
    public int nthUglyNumber(int n) {
        return ugly.nums[n-1];
    }
}