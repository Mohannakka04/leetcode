class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        mergesort(nums,low,high);

        return nums;
    }

    public static void mergesort(int[] nums,int low,int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            mergesort(nums,low,mid);
            mergesort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }

    public static void merge(int[] nums,int low,int mid,int high)
    {
        int[] arr = new int[high-low+1];
        int left = low;
        int right = mid + 1;
        int index = 0;
        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                arr[index++] = nums[left++];
            }
            else{
                arr[index++] = nums[right++];
            }
        }
        while(left<=mid)
        {
            arr[index++] = nums[left++];
        }
        while(right<=high)
        {
            arr[index++] = nums[right++];
        }
        System.arraycopy(arr,0,nums,low,arr.length);
    }
}