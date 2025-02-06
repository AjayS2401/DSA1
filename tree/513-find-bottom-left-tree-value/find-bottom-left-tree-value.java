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
    
    int depth=-1;
     int bottom;

    public int findBottomLeftValue(TreeNode root) {
        //Using DFS
        // solve(root,0);;
        // return bottom;
        //Using BFS
       
        BFS(root);
        
        return bottom;
    }
    void BFS(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                TreeNode temp=q.poll();
                   bottom=temp.val;
                if(temp.right!=null){
                    q.add(temp.right);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
            }
           
        }
    }
    // void solve(TreeNode root,int currD){
    //         if(root==null)
    //         return;

    //         if(currD>depth){
    //             bottom=root.val;
    //             depth=currD;
    //         }
    //         solve(root.left,currD+1);
    //         solve(root.right,currD+1);
    // }
}