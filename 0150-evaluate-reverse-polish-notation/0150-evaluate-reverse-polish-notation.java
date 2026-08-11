class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n  = tokens.length;
        for(int i=0;i<n;i++)
        {
            if(tokens[i].equals("+"))
            {
                int top = stack.pop();
                int newTop = top + stack.pop();
                stack.push(newTop);
            }
            else if(tokens[i].equals("*"))
            {
                int top = stack.pop();
                int newTop = top * stack.pop();
                stack.push(newTop);
            }
            else if(tokens[i].equals("/"))
            {
                int top = stack.pop();
                int newTop = stack.pop() / top;
                stack.push(newTop);
            }
            else if(tokens[i].equals("-"))
            {
                int top = stack.pop();
                int newTop = stack.pop() - top;
                stack.push(newTop);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}