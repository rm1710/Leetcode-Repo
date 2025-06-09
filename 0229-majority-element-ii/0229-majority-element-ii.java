class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c=0,c2=0;
        int candi=0, candi2=1;
        
        for(int n:nums){
            if(n==candi){ 
                c++;
            }else if(n==candi2){
                c2++;
            }else if(c==0){
                candi=n;
                c=1;
            }else if(c2==0){
                candi2=n;
                c2=1;
                
            }else{
                c--;
                c2--;
            }
        }
        
        c=0;
        c2=0;
        for(int n:nums){
            if(n==candi)c++;
            else if(n==candi2)c2++;
        }
        
        List<Integer> r=new ArrayList<>();
        if(c>nums.length/3) r.add(candi);
        if(c2>nums.length/3) r.add(candi2);
        Collections.sort(r);
        return r;
    }
}