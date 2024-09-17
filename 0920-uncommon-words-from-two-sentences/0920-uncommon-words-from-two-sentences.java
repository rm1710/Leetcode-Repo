class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> words = new ArrayList<>();
        List<String> uncommonWords = new ArrayList<>();
        
        // Add words from both sentences into the 'words' list
        for (String word : (s1 + " " + s2).split(" ")) {
            if (words.contains(word)) {
                uncommonWords.remove(word); // Remove from uncommonWords if already added
            } else {
                words.add(word);
                uncommonWords.add(word); // Add to uncommonWords
            }
        }
        
        // Convert the list of uncommon words to an array and return
        return uncommonWords.toArray(new String[uncommonWords.size()]);
    }
}