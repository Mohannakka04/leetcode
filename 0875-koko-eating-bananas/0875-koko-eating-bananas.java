class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = findMax(piles);
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int totalHours = calculatehours(piles,mid);
            if(totalHours<=h)
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static int calculatehours(int[] piles,int h)
    {
        int totalHours = 0;
        for(int i=0;i<piles.length;i++)
        {
            totalHours += Math.ceil((double)piles[i]/(double)h);
        }
        return totalHours;
    }
    public static int findMax(int[] piles)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max = Math.max(max,piles[i]);
        }
        return max;
    }
}