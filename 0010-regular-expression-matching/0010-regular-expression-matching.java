class Solution {
    public boolean isMatch(String s, String p) {
        return solve(0,0,s,p);
    }
    public static boolean solve(int i,int j,String s,String p)
    {
        int n = s.length();
        int m = p.length();
        if(j==m)
        {
            return i==n;
        }
        if(j+1<m && p.charAt(j+1)=='*')
        {
            boolean check = solve(i,j+2,s,p);
            if(i<n && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'))
            {
                check =  check || solve(i+1,j,s,p);
            }
            return check;
        }
        if(i<n && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'))
        {
            return solve(i+1,j+1,s,p);
        }
        return false;
    }
}