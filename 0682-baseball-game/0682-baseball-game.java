class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String c:operations)
        {
            if(c.equals("+"))
            {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(c.equals("C"))
            {
                stack.pop();
            }
            else if(c.equals("D"))
            {
                int top = stack.peek() * 2;
                stack.push(top);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        int sum = 0;
        for(int x:stack)
        {
            sum += x;
        }
        return sum;
    }
}