class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] str = path.split("/");
        for(String curr : str)
        {
            if(curr.equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else if(!curr.equals("") && !curr.equals("."))
            {
                s.push(curr);
            }
        }
        return "/" + String.join("/",s);
    }
}