class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int level  =  0;
        traverse(  ans , root , level );

        return ans;
    }
    void traverse(List<List<Integer>> ans , TreeNode root , int level){
        if(root == null) return;

        if(ans.size() == level){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);

        traverse(ans ,root.left , level+1 );
        traverse(ans, root.right , level+1);
    }
}
