class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        {
            return "";
        }
        char[] need = new char[128];
        char[] window = new char[128];

        for(char c:t.toCharArray())
        {
            need[c]++;
        }
        int l = 0;
        int formed = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        for(int r=0;r<s.length();r++)
        {
            char c = s.charAt(r);
            window[c]++;
            if(window[c]<=need[c])
            {
                formed++;
            }

            while(formed==t.length())
            {
                if(r-l+1<minlen)
                {
                    minlen = r-l+1;
                    start = l;
                }

                char leftChar = s.charAt(l);
                window[leftChar]--;

                if(window[leftChar]<need[leftChar])
                {
                    formed--;
                }
                l++;
            }
        }
        if(minlen==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start,start+minlen);
    }
}