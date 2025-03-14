class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String str : words) {
            String[] splitWords = str.split("\\" + separator);

            for (String word : splitWords) {
                if (!word.isEmpty()) {
                    result.add(word);
                }
            }
        }

        return result;
    }
}