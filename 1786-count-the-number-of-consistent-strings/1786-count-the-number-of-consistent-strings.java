class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int co=0;
        boolean[] aTOz=new boolean[26];

        for(char c:allowed.toCharArray()){
            aTOz[c-'a']=true;
        }

        for(String w:words){
            boolean isConsistent=true;
            for(char c: w.toCharArray()){
                if(!aTOz[c-'a']){
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent){
                co++;
            }
        }
        return co;

    }
}