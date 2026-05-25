/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
        {
            return new int[]{-1,-1};
        }
        
        int first = -1;
        int prevCritical = -1;
        int min_dst = Integer.MAX_VALUE;
        int max_dst = -1;

        int index = 1;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = head.next.next;
        while(nxt!=null)
        {
            if(isCriticalPoint(prev,curr,nxt))
            {
                if(first==-1)
                {
                    first = index;
                }
                else{
                    min_dst = Math.min(min_dst,index-prevCritical);
                    max_dst = index - first;
                }
                prevCritical = index;
            }
            prev = prev.next;
            curr = curr.next;
            nxt = nxt.next;
            index++;
        }
        if(max_dst==-1)
        {
            return new int[]{-1,-1};
        }
        return new int[]{min_dst,max_dst};
    }
    public boolean isCriticalPoint(ListNode prev,ListNode curr,ListNode nxt)
    {
        return (prev.val < curr.val && curr.val > nxt.val) || (prev.val > curr.val && curr.val < nxt.val);
    }
}