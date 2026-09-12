class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str = new StringBuilder(s.substring(0,k));
        str.reverse();
        String rev = str.toString();
        return rev+s.substring(k,s.length());
    }
}