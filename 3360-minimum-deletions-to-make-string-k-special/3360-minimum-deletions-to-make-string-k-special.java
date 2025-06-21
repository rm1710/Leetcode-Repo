class Solution {
    public int minimumDeletions(String word, int k) {
        int n=0;
        HashMap<Character,Integer> h=new HashMap<>();

        for(char c:word.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        int[] l=new int[h.size()];
        int a=0;
        for(int v:h.values()){
            l[a++]=v;
        }
        Arrays.sort(l);
        
        int minD=Integer.MAX_VALUE;

        for(int i=0;i<l.length;i++){
            int t=l[i];
            int del=0;

            for(int f:l){
                if(f<t){
                    del+=f;
                }else if(f>t+k){
                    del+=(f-(t+k));
                }
            }
            minD=Math.min(minD,del);
        }
        return minD;

    }
}