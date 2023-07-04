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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> finalans = new ArrayList<Integer>();
        right(root , finalans , 0);
        return finalans;
    }
    void right(TreeNode root , List<Integer> list , int level){
        if(root == null){
            return;
        }
        if(list.size() == level){
            list.add(root.val);
        }
        right(root.right , list , level+1);
        right(root.left , list , level+1);
    }
}