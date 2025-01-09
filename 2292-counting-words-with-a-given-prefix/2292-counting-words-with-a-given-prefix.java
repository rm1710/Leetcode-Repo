class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if(isPrefix(words[i],pref)){
                c++;
            }
        }
        return c;
    }

    private boolean isPrefix(String str, String pref) {
        return str.startsWith(pref);
    }

}