class StockSpanner {
    Deque<int[]> stack;
    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int spam = 1;
        while(!stack.isEmpty() && stack.peek()[0]<=price)
        {
            spam += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price,spam});
        return spam;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */