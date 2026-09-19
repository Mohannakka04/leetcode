class KthLargest {
    PriorityQueue<Integer> pq;
    int pos;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        pos = k;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>pos)
        {
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */