class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    c++;
                }
            }
        }
        return c;

    }

    private boolean isPrefixAndSuffix(String part, String str) {
        return str.startsWith(part) && str.endsWith(part);
    }
}