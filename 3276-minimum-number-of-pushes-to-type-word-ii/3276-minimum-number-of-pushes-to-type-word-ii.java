class Solution {
    public int minimumPushes(String word) {
        //frequency
        int arr[]=new int[26];
        for(char ch: word.toCharArray()){
            arr[ch-'a']++;
        }
        //dec order sort / pq
        Arrays.sort(arr);
        int count=0;
        int minKeyPress=0;
        //rev
        for(int i=25;i>=0;i--){
            int val=arr[i]*(count/8+1);
            minKeyPress +=val;
            count++;
        }
        return minKeyPress;
    }
}