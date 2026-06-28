class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root , targetSum , 0);
    }
    boolean helper( TreeNode node , int target , int currSum ){
        if(node == null){
            return false;
        }
        currSum += node.val;
        
        if(node.left == null && node.right == null){
            return currSum == target; 
        }
        return helper(node.left , target , currSum ) || helper(node.right , target , currSum);
        
    }
}
