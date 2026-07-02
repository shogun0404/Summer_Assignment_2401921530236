class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }
       return  checksymm(root.left , root.right);
    }
    boolean checksymm( TreeNode nodeleft , TreeNode noderight){
        if(nodeleft == null && noderight == null ) return true;
        if(nodeleft == null && noderight !=null  || nodeleft != null && noderight == null ) return false;

        if(nodeleft.val != noderight.val ) return false;
        return checksymm(nodeleft.left , noderight.right) && checksymm(nodeleft.right , noderight.left);
    }
}
