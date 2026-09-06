class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int[] res = new int[101];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            int index = nums[i];
            res[index] = 1;
        }
        for(int i=min+1;i<max;i++)
        {
            if(res[i]!=1)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}