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
    public int diameterOfBinaryTree(TreeNode root) {
            if(root==null){
            return 0;
        }
        int lftht=height(root.left);
        int rtht=height(root.right);
        
        int dia1=diameterOfBinaryTree(root.left);
        int dia2=diameterOfBinaryTree(root.right);
        int diam=lftht+rtht;
        
        
        return Math.max(diam,Math.max(dia1,dia2));
    }
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
}

     
