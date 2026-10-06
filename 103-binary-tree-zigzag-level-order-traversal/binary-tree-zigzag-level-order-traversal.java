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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> a = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        if(root == null){
            return a;
        }
        boolean left_to_right = true;
        while(!q.isEmpty()){
           
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode current = q.remove();
                level.add(current.val);
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
                    
            }
        if(!left_to_right){
            Collections.reverse(level);
        }  
        a.add(level);
        left_to_right = !left_to_right;
    }
    return a;
    }
}