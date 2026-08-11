class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                arr[i] = 0;
            }
            else{
                int index = stack.peek() - i;
                arr[i] = index;
            }
            stack.push(i);
        }
        return arr;
    }
}