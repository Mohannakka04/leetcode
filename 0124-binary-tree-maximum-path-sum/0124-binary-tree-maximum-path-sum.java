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
    public int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxHeight(root);
        return maxsum;
    }
    public int maxHeight(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh = Math.max(0,maxHeight(root.left));
        int rh = Math.max(0,maxHeight(root.right));
        maxsum = Math.max(maxsum,root.val+lh+rh);
        return root.val + Math.max(lh,rh);
    }
}