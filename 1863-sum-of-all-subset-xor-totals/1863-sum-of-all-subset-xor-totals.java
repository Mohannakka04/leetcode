class Solution {
    public int subsetXORSum(int[] nums) {
        int or = 0;
        for(int num : nums)
        {
            or = or | num;
        }
        return or * (1 << (nums.length - 1));
    }
}