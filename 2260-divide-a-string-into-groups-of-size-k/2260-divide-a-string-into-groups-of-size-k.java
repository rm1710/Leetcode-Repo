class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        

        int totalGroups = (n + k - 1) / k;

        String[] result = new String[totalGroups];
        
        int index = 0;  
        for (int i = 0; i < totalGroups; i++) {
            String group = "";

            for (int j = 0; j < k; j++) {
                if (index < n) {
                    group += s.charAt(index++);
                } else {
                    group += fill;
                }
            }

            result[i] = group;
        }

        return result;
    }
}
