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
    int bottom;
    int depth=-1;

    public int findBottomLeftValue(TreeNode root) {
        solve(root,0);;
        return bottom;
    }
    void solve(TreeNode root,int currD){
            if(root==null)
            return;

            if(currD>depth){
                bottom=root.val;
                depth=currD;
            }
            solve(root.left,currD+1);
            solve(root.right,currD+1);
    }
}