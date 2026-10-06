class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(!stack.isEmpty())
            {
                char top = stack.peek();
                if(top=='(' && ch==')')
                {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.size();
    }
}