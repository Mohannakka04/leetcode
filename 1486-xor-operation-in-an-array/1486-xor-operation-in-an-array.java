class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int xor = 0;
        for(int i=0;i<n;i++)
        {
            ans = start + 2*i;
            xor ^= ans;
        }
        return xor;
    }
}