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
    public boolean isCompleteTree(TreeNode root) {
        int totalNode=countNodes(root);
        int i=1;
        return solve(root,i,totalNode);
    }
    int countNodes(TreeNode root){
        if(root==null){
            return 0;
        }

        return 1+countNodes(root.left)+countNodes(root.right);
    }
    boolean solve(TreeNode root,int idx,int count){
        if(root==null){
            return true;
        }
        if(idx>count){
            return false;
        }

        return solve(root.left,2*idx,count) && solve(root.right,2*idx+1,count);
    }

}