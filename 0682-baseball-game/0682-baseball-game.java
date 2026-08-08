class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String op:operations)
        {
            if(op.equals("+"))
            {
                int top = stack.pop();
                int sectop = stack.peek();
                stack.push(top);
                stack.push(top+sectop);
                sum += top+sectop;
            }
            else if(op.equals("C"))
            {
                int top = stack.peek();
                stack.pop();
                sum -= top;
            }
            else if(op.equals("D"))
            {
                int top = stack.peek();
                stack.push(2*top);
                sum += 2*top;
            }
            else{
                stack.push(Integer.parseInt(op));
                sum += Integer.parseInt(op);
            }
        }
        return sum;
    }
}