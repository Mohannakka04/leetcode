class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int maxlen = 0;
        char[] c = s.toCharArray();
        for(int r=0;r<n;r++)
        {
            while(set.contains(c[r]))
            {
                set.remove(c[l]);
                l++;
            }
            set.add(c[r]);
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}