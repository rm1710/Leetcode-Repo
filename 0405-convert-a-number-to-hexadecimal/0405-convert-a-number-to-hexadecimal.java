class Solution {
    public String toHex(int num) {
        // String hex="";
        // char[] ch="0123456789abcdef".toCharArray();

        // while(num>0){
        //     int r=num%16; //remainder
        //     hex=ch[r]+hex;
        //     num/=16;
        // }

        // return hex;

        return  Integer.toHexString(num);
    }
}