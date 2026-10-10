class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int currsum = 0;
        int ans = 0;
        map.put(0, 1);
        for(int i=0;i<n;i++)
        {
            currsum += nums[i];
            int req = ((currsum % k) + k) % k;
            if(map.containsKey(req))
            {
                ans += map.get(req);
            }
            map.put(req,map.getOrDefault(req,0)+1);
        }
        return ans;
    }
}