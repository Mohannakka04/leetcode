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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode second = dummy.next;
        ListNode prev = dummy;
        while(second!=null)
        {
            if(set.contains(second.val))
            {
                prev.next = second.next;
            }
            else
            {
                prev = prev.next;
            }
            second = second.next;
        }
        return dummy.next;
    }
}