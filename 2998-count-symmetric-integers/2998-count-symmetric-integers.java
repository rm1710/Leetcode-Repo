class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i)){
                c++;
            }
        }
        return c;
    }

    public boolean isSymmetric(int n){
        String s = Integer.toString(n);
        int len = s.length();
        if (len % 2 != 0) return false;

        int mid = len / 2, sum = 0;
        for (int i = 0; i < mid; i++) {
            sum += s.charAt(i) - s.charAt(i + mid);
        }
        return sum == 0;
    }
}