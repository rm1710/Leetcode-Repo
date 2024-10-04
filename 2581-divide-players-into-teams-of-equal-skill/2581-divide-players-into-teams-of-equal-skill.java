class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start=0;
        int end=skill.length-1;
        long ans=0;
        long t=skill[start]+skill[end];

        while(start<end){
            if(skill[start]+skill[end]!=t){
                return -1;
            }
            
            ans+=skill[start]*skill[end];

            start++;
            end--;
        }
        return ans;

    }
}