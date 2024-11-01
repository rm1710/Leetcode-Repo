class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1; // To count consecutive occurrences

        for (int i = 0; i < s.length(); i++) {
            // Check if current character is same as the previous one
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1; // Reset count for a new character
            }

            // Append the character only if it appears less than or equal to 2 times consecutively
            if (count <= 2) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}