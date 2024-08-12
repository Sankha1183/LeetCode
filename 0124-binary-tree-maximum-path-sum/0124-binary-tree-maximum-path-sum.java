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
    public int maxPathSum(TreeNode root) {
        int[] maxi =new int[1];
        maxi[0]=Integer.MIN_VALUE;
        helper(root,maxi);
        return maxi[0];
        
        
        
    }
    int helper(TreeNode node,int maxi[]){
        
        if(node==null){
            return 0;
        }
        int lsum=Math.max(0,helper(node.left,maxi));
        int rsum=Math.max(0,helper(node.right,maxi));

        maxi[0]=Math.max(maxi[0],lsum+rsum+node.val);

        return node.val+Math.max(lsum,rsum);
    }
}