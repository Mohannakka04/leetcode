class Solution {
    public boolean checkValidString(String s) {
        int minopen = 0;
        int maxopen = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='(')
            {
                minopen++;
                maxopen++;
            }
            else if(ch=='*')
            {
                minopen = Math.max(0,minopen-1);
                maxopen++;
            }
            else{
                minopen = Math.max(0,minopen-1);
                maxopen--;
            }
            if(maxopen<0)
            {
                return false;
            }
        }
        return minopen==0;
    }
}