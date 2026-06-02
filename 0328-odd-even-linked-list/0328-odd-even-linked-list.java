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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode temp = head;
        ListNode temp1 = odd;
        ListNode temp2 = even;
        int count = 1;
        while(temp!=null)
        {
            if(count%2==0)
            {
                temp2.next = temp;
                temp2 = temp2.next;
            }
            else{
                temp1.next = temp;
                temp1 = temp1.next;
            }
            temp = temp.next;
            count++;
        }
        temp1.next = even.next;
        temp2.next = null;
        return odd.next;
    }
}