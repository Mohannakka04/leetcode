class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int diff = 0;
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),i);
        }
        for(int i=0;i<s.length();i++)
        {
            int index = map.get(s.charAt(i));
            diff += Math.abs(i-index);
        }
        return diff;
    }
}