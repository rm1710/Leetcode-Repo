class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }


        StringBuilder[] bucket = new StringBuilder[s.length() + 1];

        for (int i = 0; i < 256; i++) {
            int f = freq[i];
            if (f > 0) {
                if (bucket[f] == null) {
                    bucket[f] = new StringBuilder();
                }
                bucket[f].append((char) i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i].toString().toCharArray()) {
                    for (int j = 0; j < i; j++) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }
}
