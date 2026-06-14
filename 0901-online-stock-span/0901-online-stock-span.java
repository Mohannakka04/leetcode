class StockSpanner {
    public Deque<int[]> s;
    public StockSpanner() {
        s = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!s.isEmpty() && s.peek()[0]<=price)
        {
            span += s.peek()[1];
            s.pop();
        }
        s.push(new int[] {price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */