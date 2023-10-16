class StockSpanner {

    Stack<int[]> result;
    
    public StockSpanner() {
        result = new Stack<>();
    }
    
    public int next(int price) {
        
        int span = 1;
        
        while(result.size() > 0 && price >= result.peek()[0]){
            span += result.pop()[1];
        }
        int[] x = {price,span};
        result.push(x);
        
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */