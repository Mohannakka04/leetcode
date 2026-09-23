class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int l = 0;
        int r = 0;
        while (r < n) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
        return nums;
    }
}