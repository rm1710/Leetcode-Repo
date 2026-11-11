class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans= new ArrayList<>();

        int[] freq= new int[26];
        int[] window=new int[26];
        int low=0;
        int high=0;

        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }

        while(high<s.length()){
            window[s.charAt(high)-'a']++;
            if(high-low+1==p.length()){
                if(Arrays.equals(freq,window)){
                    ans.add(low);
                }
                window[s.charAt(low)-'a']--;
                low++;
            }
            high++;
        }
        return ans;
    }
}