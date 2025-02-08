class NumberContainers {
    private Map<Integer, Integer> indexMap;  // Maps index -> number
    private Map<Integer, TreeSet<Integer>> numberMap; 
    public NumberContainers() {
        indexMap=new HashMap<>();
        numberMap=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if (indexMap.containsKey(index)) {
            int oldNumber = indexMap.get(index);
            if (oldNumber == number) {
                return;  
            }
            numberMap.get(oldNumber).remove(index);
            if (numberMap.get(oldNumber).isEmpty()) {
                numberMap.remove(oldNumber);
            }
        }
        indexMap.put(index, number);
        numberMap.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }
    
    public int find(int number) {
         if (!numberMap.containsKey(number) || numberMap.get(number).isEmpty()) {
            return -1;
        }
        return numberMap.get(number).first(); 
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */