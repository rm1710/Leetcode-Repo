class Solution {
    public int maxVowels(String s, int k) {
        int low=0;
        int high=0;
        int count=0;
        int max=0;

        while(high<k){
            if(isVowel(s.charAt(high))){
                count++;
            }
            high++;
        }
        max=count;
        while(high<s.length()){
            if(isVowel(s.charAt(high))){
                count++;
            }
            high++;

            if(isVowel(s.charAt(low))){
                count--;
            }
            low++;

            max=Math.max(max,count);
        }

        return max;
    }

    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }


}