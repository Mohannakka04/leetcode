class BrowserHistory {
    ListNode home;
    ListNode curr;
    public BrowserHistory(String homepage) {
        home = new ListNode(homepage);
        curr = home;
    }
    
    public void visit(String url) {
        ListNode newNode = new ListNode(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++)
        {
            if(curr.prev==null)
            {
                break;
            }
            else{
                curr = curr.prev;
            }
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++)
        {
            if(curr.next==null)
            {
                break;
            }
            else{
                curr = curr.next;
            }
        }
        return curr.url;
    }
    static class ListNode
    {
        String url;
        ListNode prev;
        ListNode next;
        ListNode(String url)
        {
            this.url = url;
            prev = null;
            next = null;
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */