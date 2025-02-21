class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int maxCandy = Arrays.stream(candies).max().getAsInt(); 
        for (int candy : candies) {
            ls.add(candy + extraCandies >= maxCandy); 
        }
        return ls;
    }
}