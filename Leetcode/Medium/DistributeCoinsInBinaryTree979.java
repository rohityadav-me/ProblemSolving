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
    int moves = 0;
    public int distributeCoins(TreeNode root) {
        coins(root);
        return moves;
    }
    public int coins(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null){
            moves += Math.abs(root.val-1);
            return root.val-1;
        }
        root.val = root.val-1 + coins(root.left) + coins(root.right);
        moves += Math.abs(root.val);
        return root.val;
    }
}