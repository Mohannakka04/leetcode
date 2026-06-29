class Solution {
    public int findShortestSubArray(int[] nums) {
         HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {

            first.putIfAbsent(nums[i], i);

            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            if (freq.get(nums[i]) > degree) {
                degree = freq.get(nums[i]);
                ans = i - first.get(nums[i]) + 1;
            } else if (freq.get(nums[i]) == degree) {
                ans = Math.min(ans, i - first.get(nums[i]) + 1);
            }
        }

        return ans;
    }
}