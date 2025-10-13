class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ls=new ArrayList<>();
        String olds=" ";

        for(String w:words){
            char[] c= w.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            

            if(!s.equals(olds)){
                ls.add(w);
                olds=s;
            }
            
        }
        return ls;
    }
}