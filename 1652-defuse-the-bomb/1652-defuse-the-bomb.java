class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if(k==0)
        {
            return ans;
        }
        int start,end;
        if(k>0)
        {
            start = 1;
            end = k;
        }
        else{
            start = n+k;
            end = n-1;
        }
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
            sum += code[i%n];
        }
        for(int r=0;r<n;r++)
        {
            ans[r] = sum;
            sum = sum - code[start%n];
            
            start++;
            end++;
            
            sum = sum + code[end%n];
        }
        return ans;
    }
}