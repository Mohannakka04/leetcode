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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        ListNode curr = head.next;
        ListNode prev = head;
        int max = head.val;
        while(curr!=null)
        {
            if(curr.val<max)
            {
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                max = curr.val;
                prev = curr;
                curr = curr.next;
            }
        }
        return reverse(head);
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}