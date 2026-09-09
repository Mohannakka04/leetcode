class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }

        char[] count1 = new char[26];
        char[] count2 = new char[26];

        for(char c:s1.toCharArray())
        {
            count1[c-'a']++;
        }

        for(int i=0;i<s1.length();i++)
        {
            count2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(count1,count2))
        {
            return true;
        }

        int l = 0;
        for(int r=s1.length();r<s2.length();r++)
        {
            count2[s2.charAt(l)-'a']--;

            count2[s2.charAt(r)-'a']++;

            if(Arrays.equals(count1,count2))
            {
                return true;
            }
            l++;
        }
        return false;
    }
}