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
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        leafpathsum(root,sum,targetSum);
        return ans;
    }
    void leafpathsum(TreeNode node , int sum , int targetSum){
        if(node==null) return ;
        if(node.left==null && node.right==null){
            sum+=node.val;
            if(sum==targetSum) ans = true;
            return;
        }
        leafpathsum(node.left , sum+node.val , targetSum);
        leafpathsum(node.right , sum+node.val , targetSum);
    }
}