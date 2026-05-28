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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        temp = head;
        ListNode left = null;
        ListNode right = null;
        for(int i=1;i<=count;i++)
        {
            if(i==k)
            {
                left = temp;
            }
            if(i==(count-k+1))
            {
                right = temp;
            }
            temp = temp.next;
        }
        int temp1 = left.val;
        left.val = right.val;
        right.val = temp1;
        return head;
    }
}