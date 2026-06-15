class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<double[]> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            double time = (double) (target - position[i])/speed[i];
            list.add(new double[]{position[i], time});
        }
        list.sort((a,b) -> Double.compare(a[0],b[0]));

        Deque<double[]> s = new ArrayDeque<>();
        for(double[] car:list)
        {
            s.push(car);
        }

        int count = 0;
        double lastTime = -1;
        while(!s.isEmpty())
        {
            double currTime = s.pop()[1];
            if(lastTime==-1 || currTime>lastTime)
            {
                count++;
                lastTime = currTime;
            }
        }
        return count;
    }
}