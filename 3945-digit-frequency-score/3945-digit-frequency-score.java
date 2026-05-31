class Solution {
    public int digitFrequencyScore(int n) {
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(n!=0){
            int digit=n%10;
            hm.put(digit,hm.getOrDefault(digit,0)+1);
            n/=10;
        }

        for(int k:hm.keySet()){
            int value=hm.get(k);
            ans+=k*value;
        }
        return ans;
    }
}