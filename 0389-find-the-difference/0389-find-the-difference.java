class Solution {
    public char findTheDifference(String s, String t) {
        char r=0;

        for(int i=0;i<s.length();i++){
            r^=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            r^=t.charAt(j);
        }
        return r;
        
    }

}