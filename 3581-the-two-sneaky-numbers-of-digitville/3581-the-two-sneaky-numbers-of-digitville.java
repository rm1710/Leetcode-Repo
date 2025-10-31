class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

         List<Integer> sneaky = new ArrayList<>();
        for (int key : hm.keySet()) {
            if (hm.get(key) > 1) {
                sneaky.add(key);
            }
        }
        int[] res = new int[sneaky.size()];
        for (int i = 0; i < sneaky.size(); i++) {
            res[i] = sneaky.get(i);
        }

        return res;
    }
}