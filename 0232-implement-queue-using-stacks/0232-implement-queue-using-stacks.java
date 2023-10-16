class MyQueue {
    Stack<Integer> first;
    Stack<Integer> q;

    public MyQueue() {
        this.first = new Stack<Integer>();
        this.q = new Stack<Integer>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        if(q.empty()){
            while(first.empty()!=true){
                q.push(first.pop());
            }
        }
        return q.pop();
    }
    
    public int peek() {
        if(q.empty()){
            while(first.empty()!=true){
                q.push(first.pop());
            }
        }
        return q.peek();
    }
    
    public boolean empty() {
        return q.empty() && first.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */