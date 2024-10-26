import java.util.Hashtable;

class Solution {
    public String intToRoman(int num) {
        Hashtable<Integer, String> is = new Hashtable<>();
        is.put(1000, "M");
        is.put(900, "CM");
        is.put(500, "D");
        is.put(400, "CD");
        is.put(100, "C");
        is.put(90, "XC");
        is.put(50, "L");
        is.put(40, "XL");
        is.put(10, "X");
        is.put(9, "IX");
        is.put(5, "V");
        is.put(4, "IV");
        is.put(1, "I");

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb= new StringBuilder();
        for(Integer key:values){
            while(num>=key){
                sb.append(is.get(key));
                num-=key;
            }
        }
        return sb.toString();
    }
    
}