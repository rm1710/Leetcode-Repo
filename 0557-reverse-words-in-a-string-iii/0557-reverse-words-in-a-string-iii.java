class Solution {
    public String reverseWords(String s) {
        StringBuilder sb1=new StringBuilder();

        String[] str= s.split(" ");

        String r="";
        for(int i=0;i<str.length;i++){
            String rev="";
            for(int j=str[i].length()-1;j>=0;j--){
                rev+=str[i].charAt(j);
            }

            r+=rev+" ";
        }

        return r.trim();
    }
}