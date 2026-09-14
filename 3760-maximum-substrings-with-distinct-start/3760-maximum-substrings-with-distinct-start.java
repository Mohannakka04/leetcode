class Solution {
    public int maxDistinct(String s) {
        int count = 0;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a'] = 1;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        return count;
    }
}