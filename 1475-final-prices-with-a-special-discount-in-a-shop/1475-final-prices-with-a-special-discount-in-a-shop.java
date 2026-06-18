class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()>prices[i])
            {
                s.pop();
            }
            ans[i] = prices[i] - (s.isEmpty() ? 0 : s.peek());
            s.push(prices[i]);
        }
        return ans;
    }
}