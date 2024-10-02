class Solution {
  public int[] arrayRankTransform(int[] arr) {
    // Create a copy of the original array and sort it
    int[] sortedArr = arr.clone();
    Arrays.sort(sortedArr);

    // Map to store the rank of each unique element
    Map<Integer, Integer> rank = new HashMap<>();
    int rankCounter = 1;

    // Assign rank to each unique element
    for (int num : sortedArr) {
      if (!rank.containsKey(num)) {
        rank.put(num, rankCounter);
        rankCounter++;
      }
    }

    // Replace elements in the original array with their rank
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rank.get(arr[i]);
    }
    return arr;
  }
}
