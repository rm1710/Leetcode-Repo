class Solution {

    public int minimumPairRemoval(int[] nums) {

        int operations = 0;

        List<Integer> numbers =
                Arrays.stream(nums)
                      .boxed()
                      .collect(Collectors.toList());

    
        while (containsInversion(numbers)) {

            List<Integer> adjacentPairSums = new ArrayList<>();


            for (int i = 0; i < numbers.size() - 1; i++) {
                adjacentPairSums.add(
                        numbers.get(i) + numbers.get(i + 1)
                );
            }

 
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < adjacentPairSums.size(); i++) {
                if (adjacentPairSums.get(i) < minSum) {
                    minSum = adjacentPairSums.get(i);
                    minIndex = i;
                }
            }


            numbers.set(minIndex, minSum);
            numbers.remove(minIndex + 1);

            operations++;
        }

        return operations;
    }

    private boolean containsInversion(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
