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
    int preindex=0;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder, 0 , inorder.length-1);
    }
    TreeNode build (int [] preorder, int start , int end){
        if(start>end){
            return null;
        }
        int root = preorder[preindex++];
        TreeNode node = new TreeNode(root);
        int index = map.get(root);

        node.left=build(preorder,start, index-1);
        node.right=build(preorder,index+1,end);
        

        return node;
    }
}
