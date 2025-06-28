class Solution {
    public int maxRepeating(String sequence, String word) {
        int a=0;
        StringBuilder s=new StringBuilder(word);
        while(sequence.contains(s.toString())){
            a++;
            s.append(word);
        }
        return a;
    }
}