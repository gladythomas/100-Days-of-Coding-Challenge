class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int h1 = maxDepth(root.left);
        int h2 = maxDepth(root.right);
        
        int ans = Math.max(h1,h2) + 1;
        return ans;
    }
}