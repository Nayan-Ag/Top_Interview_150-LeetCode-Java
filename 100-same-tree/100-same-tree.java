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
    boolean ans = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Same(p,q);
        return ans;
    }
    void Same(TreeNode p , TreeNode q){
        if(p==null && q==null) return ;
        if(p==null || q==null || p.val!=q.val){ ans = false; return; }
        isSameTree(p.left , q.left);
        isSameTree(p.right , q.right);
        return ;
    }
}