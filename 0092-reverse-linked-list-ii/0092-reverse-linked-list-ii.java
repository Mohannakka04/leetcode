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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode beforeLeft = dummy;
        for(int i=1;i<left;i++)
        {
            beforeLeft = beforeLeft.next;
        }
        ListNode curr = beforeLeft.next;
        ListNode leftNode = curr;
        ListNode prev = null;
        for(int i=left;i<=right;i++)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        beforeLeft.next = prev;
        leftNode.next = curr;
        return dummy.next;
    }
}