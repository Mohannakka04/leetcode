class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(str.length());
            }
            else if(s.charAt(i)==')')
            {
                int start = stack.pop();
                int end = str.length()-1;
                while(start<end)
                {
                    char temp = str.charAt(start);
                    str.setCharAt(start,str.charAt(end));
                    str.setCharAt(end,temp);
                    start++;
                    end--;
                }
            }
            if(Character.isLetter(s.charAt(i)))
            {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}