class FrontMiddleBackQueue {
    List<Integer> data;
    public FrontMiddleBackQueue() {
        this.data = new ArrayList<>();
    }
    
    public void pushFront(int val) {
        data.add(0,val);
    }
    
    public void pushMiddle(int val) {
        int temp = data.size()/2;
        data.add(temp,val);
    }
    
    public void pushBack(int val) {
        data.add(val);
    }
    
    public int popFront() {
        if(data.size()>0){
            return data.remove(0);
        }
        return -1;
    }
    
    
    public int popMiddle() {
        if(data.size()>0){
            if(data.size()%2==0){
                return data.remove(data.size()/2 - 1);
            }else{
                return data.remove(data.size()/2);
            }
            
        }
        return -1;
    }
    
    public int popBack() {
        if(data.size()>0){
            return data.remove(data.size()-1);
        }
        return -1;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */