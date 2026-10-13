class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        long ans = 0;
        while(i<j)
        {
            ans += arr[j];
            ans -= arr[i];
            i++;
            j--;
        }
        if(n%2==1)
        {
            ans += arr[(n)/2];
        }
        return ans;
    }
}