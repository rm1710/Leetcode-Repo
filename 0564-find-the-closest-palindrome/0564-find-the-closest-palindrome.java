class Solution {
    // Helper function to create a palindrome from the first half
    private long createPalindrome(long firstHalf, boolean isOddLength) {
        long palindrome = firstHalf;
        if (isOddLength) {
            firstHalf /= 10;
        }
        while (firstHalf > 0) {
            palindrome = palindrome * 10 + (firstHalf % 10);
            firstHalf /= 10;
        }
        return palindrome;
    }

    public String nearestPalindromic(String n) {
        int len = n.length();
        boolean isOddLength = (len % 2 != 0);
        long originalNumber = Long.parseLong(n);
        long firstHalf = Long.parseLong(n.substring(0, (len + 1) / 2));

        // Generate possible palindrome candidates
        ArrayList<Long> candidates = new ArrayList<>();
        candidates.add(createPalindrome(firstHalf, isOddLength));
        candidates.add(createPalindrome(firstHalf + 1, isOddLength));
        candidates.add(createPalindrome(firstHalf - 1, isOddLength));
        candidates.add((long) Math.pow(10, len - 1) - 1); // Smallest possible number with len-1 digits
        candidates.add((long) Math.pow(10, len) + 1);     // Smallest possible number with len+1 digits

        // Find the closest palindrome
        long closest = 0;
        long minDifference = Long.MAX_VALUE;
        for (long candidate : candidates) {
            if (candidate == originalNumber) continue;
            long difference = Math.abs(candidate - originalNumber);
            if (difference < minDifference || (difference == minDifference && candidate < closest)) {
                closest = candidate;
                minDifference = difference;
            }
        }

        return String.valueOf(closest);
    }
}