class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int n = nums.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int count = 0;
            int curr = nums.get(i);
            while(curr!=0)
            {
                if(curr%2!=0)
                {
                    int index = count;
                    map.put(index,map.getOrDefault(index,0)+1);
                }
                count++;
                curr /= 2;
            }
        }
        long ans = 0;
        long MOD = 1_000_000_007L;
        while(k-->0)
        {
            long temp = 0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                if(entry.getValue()>0)
                {
                    temp |=  (1L <<entry.getKey());
                    entry.setValue(entry.getValue() - 1);
                }
            }
            ans = (ans + temp*temp) % MOD;
        }
        return (int) ans;
    }
}