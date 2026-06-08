class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("*"))
            {
                int top = s.pop();
                int newTop = top*s.pop();
                s.push(newTop);
            }
            else if(tokens[i].equals("+"))
            {
                int top = s.pop();
                int newTop = top+s.pop();
                s.push(newTop);
            }
            else if(tokens[i].equals("-"))
            {
                int top = s.pop();
                int newTop = s.pop()-top;
                s.push(newTop);
            }
            else if(tokens[i].equals("/"))
            {
                int top = s.pop();
                int newTop = s.pop()/top;
                s.push(newTop);
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}