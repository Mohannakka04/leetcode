class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int l = 0;
        int count = 0;
        int max = 0;
        int satisfied = 0;
        for(int r=0;r<n;r++)
        {
            if(grumpy[r]==0)
            {
                satisfied += customers[r];
            }
            else
            {
                count += customers[r];
            }
            if(r-l+1>minutes)
            {
                if(grumpy[l]==1)
                {
                    count -= customers[l];
                }
                l++;
            }
            max = Math.max(count,max);
        }
        return max + satisfied;
    }
}