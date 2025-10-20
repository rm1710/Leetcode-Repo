class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String str:operations){
            if(str.equals("++X")){
                ++X;
            }else if(str.equals("X++")) {
                X++;
            }else if(str.equals("X--")) {
                X--;
            }else if(str.equals("--X")) {
                --X;
            }
        }
        return X;
    }
}