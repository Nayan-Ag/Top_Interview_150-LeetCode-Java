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
    List<Double> result = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        average(root);
        return result;
    }
    void average(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count = 0;
        double sum = 0;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr==null){
                sum = sum/count;
                result.add(sum);
                sum = 0;
                count = 0;
                if(!q.isEmpty())q.add(null);
            }
            else{
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                sum+=curr.val;
                count++;
            }
        }
    }
}