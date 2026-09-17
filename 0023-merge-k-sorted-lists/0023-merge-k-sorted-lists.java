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
    class Pair{
        int val;
        ListNode node;
        Pair(int value,ListNode node)
        {
            val = value;
            this.node = node;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));

        for(int i=0;i<lists.length;i++)
        {
            if (lists[i] != null) {
                pq.add(new Pair(lists[i].val, lists[i]));
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(!pq.isEmpty())
        {
            Pair temp = pq.poll();
            ListNode node = temp.node;

            curr.next = node;
            curr = curr.next;

            if(node.next!=null)
            {
                pq.add(new Pair(node.next.val,node.next));
            }
        }

        return dummy.next;
    }
}