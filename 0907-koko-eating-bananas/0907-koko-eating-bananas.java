class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=Arrays.stream(piles).max().getAsInt();

        while(s<e){
            int mid=s+(e-s)/2;
            int hours=0;
            for(int pile:piles){
                hours += (int) Math.ceil((double) pile / mid);
            }

            if(hours>h){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
}