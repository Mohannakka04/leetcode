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

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                if(leftToRight)
                {
                    level.addLast(node.val);
                }
                else{
                    level.addFirst(node.val);
                }
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }
            }
            leftToRight = !leftToRight;
            list.add(level);
        }
        return list;
    }
}