class MinStack {
    Stack<Integer> ye;
    List<Integer> data;
    public MinStack() {
        this.ye = new Stack<Integer>();
        this.data = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        ye.push(val);
        data.add(val);
    }
    
    public void pop() {
        ye.pop();
        data.remove(data.size()-1);
    }
    
    public int top() {
        return ye.peek();

    }
    
    public int getMin() {
        
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<data.size();i++){
            min = Math.min(data.get(i),min);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */