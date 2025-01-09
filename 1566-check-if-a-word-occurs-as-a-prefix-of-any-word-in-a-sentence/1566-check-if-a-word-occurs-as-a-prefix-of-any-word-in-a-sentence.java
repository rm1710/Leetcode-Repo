class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String s[]=sentence.split("\\s");
        int c;
        for(int i=0;i<=s.length-1;i++){
            if(isprefix(s[i],searchWord)){
                return i+1;
            }
        }
        return -1;
    }

    private boolean isprefix(String s,String sw){
        return s.startsWith(sw);
    }
}