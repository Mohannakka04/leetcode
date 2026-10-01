class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!stack.isEmpty())
            {
                int top = stack.peek();
                if((top=='(' && ch==')') || (top=='[' && ch==']') || (top=='{' && ch=='}'))
                {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.isEmpty();
    }
}