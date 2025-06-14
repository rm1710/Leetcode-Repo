class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
    
        char ma = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                ma = c;
                break;
            }
        }
        
        char m = s.charAt(0);
        
        int max = Integer.parseInt(s.replace(ma, '9'));
        int min = Integer.parseInt(s.replace(m, '0'));
        
        return max - min;
    }
}
