class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int depth = 0;
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='(')
            {
                depth++;
            }
            else if(ch==')')
            {
                if(s.charAt(i-1)=='(')
                {
                    ans += Math.pow(2,depth-1);
                }
                depth--;
            }
        }
        return ans;
    }
}