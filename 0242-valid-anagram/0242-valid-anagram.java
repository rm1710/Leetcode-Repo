
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] c=s.toCharArray();
        char[] c2=t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c2);

        return Arrays.equals(c,c2);
    }
}