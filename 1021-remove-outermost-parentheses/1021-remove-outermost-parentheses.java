class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int depth = 0;
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='(')
            {
                if(depth>0)
                {
                    str.append(ch);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0)
                {
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}