class Solution {
    public int longestConsecutive(int[] nums) {
        int ls=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }

        for(int s:hs){
            if(!hs.contains(s-1)){
                int currNum=s;
                int currStreak=1;

                while(hs.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                ls=Math.max(ls,currStreak);
            }
        }
        return ls;
    }
}