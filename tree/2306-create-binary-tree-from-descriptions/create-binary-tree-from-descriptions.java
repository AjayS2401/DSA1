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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> hm=new HashMap<>();
        Set<Integer> hs=new HashSet<>();
        for(int[] num:descriptions){
            int par=num[0];
            int child=num[1];
            boolean left=num[2]==1;

            hm.putIfAbsent(par,new TreeNode(par));
            hm.putIfAbsent(child,new TreeNode(child));
            if(left){
                hm.get(par).left=hm.get(child);
            }else{
                hm.get(par).right=hm.get(child);
            }
            hs.add(child);
        }
            for(int[] des:descriptions){
                int par=des[0];
                if(!hs.contains(par)){
                    return hm.get(par);
                }
            }
return null;
    }
}