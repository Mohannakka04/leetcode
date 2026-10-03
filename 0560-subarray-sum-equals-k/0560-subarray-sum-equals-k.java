class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int currsum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            currsum += nums[i];
            int req = currsum - k;
            if(map.containsKey(req))
            {
                count += map.get(req);
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}