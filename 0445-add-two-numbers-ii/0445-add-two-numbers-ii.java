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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        int sum = 0;
        while(list1!=null || list2!=null)
        {
            sum = carry;
            if(list1!=null)
            {
                sum += list1.val;
                list1 = list1.next;
            }
            if(list2!=null)
            {
                sum += list2.val;
                list2 = list2.next;
            }
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            curr.next = newNode;
            curr = curr.next;
        }
        if(carry!=0)
        {
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }
        return reverse(dummy.next);
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