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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        inorder(root,ls);
        return ls;
    }

    public void inorder(TreeNode node, List<Integer> result){
        if(node==null) return;
        inorder(node.left,result);
        result.add(node.val);
        inorder(node.right,result);
    }
}