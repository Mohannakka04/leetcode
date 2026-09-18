class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length)
        {
            return -1;
        }
        int n = nums.length;
        int sumOfPages = 0;
        int maxPages = 0;
        for(int i=0;i<n;i++)
        {
            sumOfPages += nums[i];
            maxPages = Math.max(maxPages,nums[i]);
        }

        int low = maxPages;
        int high = sumOfPages;
        int ans = sumOfPages;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(isPossible(nums,n,k,mid))
            {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] nums,int n,int k,int maxPages)
    {
        int count = 1;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>maxPages)
            {
                return false;
            }
            if(sum+nums[i]<=maxPages)
            {
                sum += nums[i];
            }
            else{
                count++;
                sum = nums[i];
                if(count>k)
                {
                    return false;
                }
            }
        }
        return true;
    }
}