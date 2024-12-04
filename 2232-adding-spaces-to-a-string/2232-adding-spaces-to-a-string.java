class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int start = 0;

        for (int index : spaces) {
            result.append(s, start, index).append(" ");
            start = index;
        }

        return result.append(s.substring(start)).toString();
    }
}