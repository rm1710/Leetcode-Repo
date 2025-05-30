class MyHashMap {

    int[] map;

    public MyHashMap() {
        map = new int[1000001];
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}
