class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] word= sentence.split(" ");
        
        for(int i=0;i<word.length-1;i++){
            char lastchar= word[i].charAt(word[i].length()-1);
            char firstchar= word[i+1].charAt(0);
            if(lastchar!=firstchar){
                return false;
            }
        }
        char lastCharOfLastWord = word[word.length - 1].charAt(word[word.length - 1].length() - 1);
        char firstCharOfFirstWord = word[0].charAt(0);

        return lastCharOfLastWord == firstCharOfFirstWord;

    }
}