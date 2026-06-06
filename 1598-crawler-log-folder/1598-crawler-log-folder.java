class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int n = logs.length;
        for(int i=0;i<n;i++)
        {
            String c = logs[i];
            if(c.equals("../"))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else if(!c.equals("./"))
            {
                stack.push(c);
            }
        }
        return stack.size();
    }
}