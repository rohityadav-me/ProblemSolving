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
    int cameras = 0;
    public int minCameraCover(TreeNode root) {
        if(root==null)
            return cameras;
        if(isCaptured(root).equals("want"))
            cameras++;
        return cameras;
    }
    public String isCaptured(TreeNode node){
        if(node==null)
            return "";
        if(node.left==null && node.right==null)
            return "want";
        String statusLeft = isCaptured(node.left);
        String statusRight = isCaptured(node.right);
        if(statusLeft.equals("want") || statusRight.equals("want")){
            cameras++;
            return "capturing";
        }else if(statusLeft.equals("capturing") || statusRight.equals("capturing")){
            return "";
        }
        return "want";
    }
}