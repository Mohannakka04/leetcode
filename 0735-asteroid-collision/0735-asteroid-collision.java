class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<asteroids.length;i++)
        {
            int curr = asteroids[i];
            while(!s.isEmpty() && s.peek()>0 && curr<0)
            {
                int top = s.peek();
                if(top<-curr)
                {
                    s.pop();
                }
                else if(top==-curr)
                {
                    s.pop();
                    curr = 0;
                    break;
                }
                else{
                    curr = 0;
                    break;
                }
            }
            if(curr!=0)
            {
                s.push(curr);
            }
        }
        int[] ans = new int[s.size()];
        for(int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }
        return ans;
    }
}