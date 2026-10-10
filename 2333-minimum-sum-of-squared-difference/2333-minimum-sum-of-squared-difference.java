class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] arr = new int[100001];
        int maxDiff = 0;
        long totalDiff = 0;
        for(int i=0;i<n;i++)
        {
            int diff = Math.abs(nums1[i]-nums2[i]);
            arr[diff]++;
            maxDiff = Math.max(maxDiff,diff);
            totalDiff += diff;
        }

        long k = (long) k1 + k2;
        if(totalDiff<=k)
        {
            return 0;
        }
        
        for(int i=maxDiff;i>0;i--)
        {
            if(k==0)
            {
                break;
            }
            int moves = (int) Math.min(k,arr[i]);
            arr[i] = arr[i] - moves;
            arr[i-1] = arr[i-1] + moves;
            k = k - moves;
        }

        long ans = 0;
        for(int i=1;i<=maxDiff;i++)
        {
            ans += (long) i * i * arr[i];
        }
        return ans;
    }
}