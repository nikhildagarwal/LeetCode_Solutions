class MyHashMap {
    int[] data;
    boolean[] present;
    public MyHashMap() {
        this.data = new int[1000000+1];
        this.present = new boolean[1000000+1];
    }
    
    public void put(int key, int value) {
        present[key] = true;
        data[key] = value;
    }
    
    public int get(int key) {
        if(present[key]==true) return data[key];
        else return -1;
    }
    
    public void remove(int key) {
        present[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */