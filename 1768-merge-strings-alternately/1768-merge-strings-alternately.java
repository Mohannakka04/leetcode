class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int l = 0;
        int r = 0;

        StringBuilder s = new StringBuilder();
        while(l<n1 && r<n2)
        {
            s.append(word1.charAt(l));
            s.append(word2.charAt(r));
            l++;
            r++;
        }
        if(l<n1)
        {
            while(l<n1)
            {
                s.append(word1.charAt(l));
                l++;
            }
        }
        if(r<n2)
        {
            while(r<n2)
            {
                s.append(word2.charAt(r));
                r++;
            }
        }
        return s.toString();
    }
}