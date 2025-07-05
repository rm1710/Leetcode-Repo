class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();

        for(int n:arr){
            h.put(n,h.getOrDefault(n,0)+1);
        }

        int a=-1;

        for(int k:h.keySet()){
            if(k==h.get(k)){
                a=k;
            }
        }

        return a;
    }
}