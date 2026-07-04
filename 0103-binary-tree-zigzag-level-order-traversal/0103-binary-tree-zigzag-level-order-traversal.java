/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root==null)
        {
            return list;
        }

        boolean flag = true;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int[] arr = new int[size];
            for(int i=0;i<size;i++)
            {
                TreeNode newNode = queue.poll();
                int index = (flag) ? i : (size-1-i);
                arr[index] = newNode.val;
                if(newNode.left!=null)
                {
                    queue.offer(newNode.left);
                }
                if(newNode.right!=null)
                {
                    queue.offer(newNode.right);
                }
            }
            List<Integer> temp = new ArrayList<>();
            for(int x:arr)
            {
                temp.add(x);
            }
            flag = !flag;
            list.add(temp);
        }
        return list;
    }
}