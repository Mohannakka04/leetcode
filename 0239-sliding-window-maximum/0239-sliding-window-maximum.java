class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int r=0;r<n;r++)
        {
            if(!dq.isEmpty() && dq.peekFirst()<=r-k)
            {
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[r])
            {
                dq.removeLast();
            }
            dq.addLast(r);
            if(r>=k-1)
            {
                res[l++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}