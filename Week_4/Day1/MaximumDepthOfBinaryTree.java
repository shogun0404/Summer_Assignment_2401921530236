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
    public int maxDepth(TreeNode root) {
        TreeNode curr = root;
        
       return count(curr ); 
    
    }
    int count(TreeNode curr ){
        if(curr == null){
            return 0;
        }
        int left = 1 + count(curr.left);
        int right = 1 + count(curr.right);
        return  Math.max( left , right );
    }
}
