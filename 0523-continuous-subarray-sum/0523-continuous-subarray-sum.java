class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int currsum = 0;
        for(int i=0;i<n;i++)
        {
            currsum += nums[i];
            int req = currsum % k;
            if(map.containsKey(req))
            {
                int diff = Math.abs(map.get(req) - i);
                if(diff>=2)
                {
                    return true;
                }
            }
            else{
                map.put(req,i);
            }
        }
        return false;
    }
}