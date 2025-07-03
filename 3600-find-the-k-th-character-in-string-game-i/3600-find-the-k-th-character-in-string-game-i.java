class Solution {
    public char kthCharacter(int k) {
        String w="a";
        while(w.length()<k){
            String nP="";
            for(char c:w.toCharArray()){
                char nc=getNc(c);
                nP+=nc;
            }
            w+=nP;
        }
        return w.charAt(k-1);
    }

    public static char getNc(char ch){
        if(ch == 'z'){
            return 'a';
        }else{
            return (char)(ch+1);
        }
    }
}