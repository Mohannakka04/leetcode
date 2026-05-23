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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val!=0)
            {
                int sum = 0;
                while(temp.val!=0)
                {
                    sum += temp.val;
                    temp = temp.next;
                }
                arr.add(sum);
            }
            if(temp!=null)
            {
                temp = temp.next;
            }
        }
        ListNode list = new ListNode(arr.get(0));
        ListNode temp1 = list;
        for(int i=1;i<arr.size();i++)
        {
            ListNode newNode = new ListNode(arr.get(i));
            temp1.next = newNode;
            temp1 = temp1.next;
        }
        return list;
    }
}