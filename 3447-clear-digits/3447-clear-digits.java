class Solution {
    public String clearDigits(String s) {
        while (true) {
            boolean found = false;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    if (i > 0) {
                        s = s.substring(0, i - 1) + s.substring(i + 1);
                    } else {
                        s = s.substring(1);
                    }
                    found = true;
                    break;  // Restart the loop after modifying the string
                }
            }
            if (!found) break;  // Stop when no digits are left
        }
        return s;
    }
}
